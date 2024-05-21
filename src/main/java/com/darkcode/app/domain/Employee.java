package com.darkcode.app.domain;

import lombok.Data;

@Data
public class Employee {
    private Long id;
    private String fullname;
    private String user_email;
    
    public Employee(){}

    public Long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUser_email() {
        return user_email;
    }

   public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
}