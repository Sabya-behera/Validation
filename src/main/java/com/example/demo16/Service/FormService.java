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
    public Form getById(int id)
    {
        return formRepository.getById(id);
    }
    public Form updateForm(int id,Form form)
    {
        Form form1 = formRepository.getById(id);
        form1.setName(form.getName());
        form1.setEmail(form.getEmail());
        form1.setPhno(form.getPhno());
        form1.setPassword(form.getPassword());
        formRepository.save(form1);
        return form1;
    }
    public void deleteForm(int id)
    {
        formRepository.deleteById(id);
    }
}
