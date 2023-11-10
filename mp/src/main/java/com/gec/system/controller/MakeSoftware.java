package com.gec.system.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gec.system.entity.Form;
import com.jcraft.jsch.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.*;

@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/make")
@RestController
public class MakeSoftware {
    @PostMapping("/software")
    public Form make(@RequestBody Form from) {
        System.out.println(from);
        String host = "192.168.3.163";
        String user = "user_w_location_TV";
        String password = "dx88404355tv";
        int port = 22;

        JSch jsch = new JSch();
        Session session = null;
        try {
            session = jsch.getSession(user, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.connect();

            ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
            channelSftp.connect();

            // 读取文件内容
            BufferedReader reader ;
            // 写入文件内容
            channelSftp.put(new ByteArrayInputStream(generateJson(from).getBytes()), "/local/user_w_location_TV/lm/software.json");
            String command = "/local/user_w_location_TV/lm/update.sh";
            ChannelExec channel = (ChannelExec) session.openChannel("exec");
            channel.setCommand(command);
            channel.connect();

            // 读取输出
            InputStream in = channel.getInputStream();
            reader = new BufferedReader(new InputStreamReader(in));
            String l;
            while ((l = reader.readLine()) != null) {
                System.out.println(l);
            }
            channelSftp.disconnect();
            session.disconnect();
            channel.disconnect();
        } catch (JSchException | SftpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return from;
    }
    public String generateJson(Form form){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(form);
            return json;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
