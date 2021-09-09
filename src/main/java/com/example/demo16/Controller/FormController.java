package com.example.demo16.Controller;

import com.example.demo16.Model.Form;
import com.example.demo16.Service.FormService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class FormController {
    @Autowired
    private FormService formService;

    @PostMapping("/post")
    public Form addForm(@Valid @RequestBody Form form){
        Form savedUser =formService.addForm(form);
        System.out.println("Its Working");
        return savedUser;
    }

}