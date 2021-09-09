package com.example.demo16.Service;


import com.example.demo16.Model.Form;
import com.example.demo16.Repository.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;
    public Form addForm(Form form)
    {
        return formRepository.save(form);
    }
}
