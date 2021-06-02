package com.serendipity.pojo;

import org.hibernate.validator.constraints.NotBlank;

@SuppressWarnings("deprecation")
public class Users {
    @NotBlank
    private String name;
    @NotBlank
    private String password;
    private String age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Users [name=" + name + ", password=" + password + ", age=" + age + "]";
    }
    
}
