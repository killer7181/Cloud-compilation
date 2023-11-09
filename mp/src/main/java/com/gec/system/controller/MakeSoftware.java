package com.gec.system.controller;

import com.gec.system.entity.Form;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/make")
@RestController
public class MakeSoftware {
   @PostMapping ("/software")
    public Form make(@RequestBody Form from){
        System.out.println(from);
        return from;
    }
}
