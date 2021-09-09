package com.example.demo16.Model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Table(name = "Form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    /*---------------------Validaton-------------------------*/
    @Size(min = 4, message = "user name should have at least 4 characters")
//    @NotBlank
     @NotNull(message = "No null values ")
//    @NotEmpty
    private String name;
//    @Column(name = "Date",nullable = false)
//    private Date date;
    /*---------------------Validation-----------------------*/
    @Size(min = 10,message = "A ten digit Mob no is required")
    private String phno;
    /*---------------------Validation--------------------*/
    @NotBlank
    @Size(min = 8,max = 16,message = "password should have at least 8 characters")
    private String password;
    /*---------------------Validation----------------------*/
    @Email
    @NotBlank
    private String email;


    public Form() {
    }

    public Form(int id, String name/*Date date*/,String phno,String password,String email) {
        this.id = id;
        this.name = name;
//        this.date = date;
        this.phno = phno;
        this.password=password;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
