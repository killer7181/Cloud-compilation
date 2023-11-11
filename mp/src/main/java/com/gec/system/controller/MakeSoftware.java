package com.gec.system.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gec.system.entity.Form;
import com.jcraft.jsch.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.io.*;
import java.util.concurrent.CountDownLatch;

@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/make")
@RestController
public class MakeSoftware {
    @PostMapping("/software")
    public Form make(@RequestBody Form from) {
        System.out.println(from);
        String host1 = "192.168.3.163";
        String user1 = "user_w_location_TV";
        String password1= "dx88404355tv";
        int port = 22;
        String host2 = "192.168.3.165";
        String user2 = "eng_lzj";
        String password2= "dx88404355lzj";

        JSch jsch = new JSch();

        Session session1 = null;
        Session session2 = null;
        try {
            session1 = jsch.getSession(user1, host1, port);
            session1.setPassword(password1);
            session1.setConfig("StrictHostKeyChecking", "no");
            session1.connect();
            session2 = jsch.getSession(user2, host2, port);
            session2.setPassword(password2);
            session2.setConfig("StrictHostKeyChecking", "no");
            session2.connect();
            ChannelSftp channelSftp1 = (ChannelSftp) session1.openChannel("sftp");
            ChannelSftp channelSftp2 = (ChannelSftp) session2.openChannel("sftp");
            channelSftp1.connect();
            channelSftp2.connect();
            CountDownLatch latch = new CountDownLatch(1);
            // 写入文件内容
            channelSftp2.put(new ByteArrayInputStream(generateJson(from).getBytes()), "/data1/lm/HISI_AN12/other/software.json");
            // 执行后面的代码
            String command = "cd /data1/lm/HISI_AN12/other && /bin/bash /data1/lm/HISI_AN12/other/update.sh";
            ChannelExec channel = (ChannelExec) session2.openChannel("exec");
            channel.setCommand(command);
            channel.connect();
            // 读取输出
            InputStream in = channel.getInputStream();
            BufferedReader reader  = new BufferedReader(new InputStreamReader(in));
            String l;
            while ((l = reader.readLine()) != null) {
                System.out.println(l);
            }
            session2.disconnect();
            channel.disconnect();
            latch.countDown();
            channelSftp1.disconnect();
            session1.disconnect();
            session2.disconnect();
            channelSftp2.disconnect();

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
