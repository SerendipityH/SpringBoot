package com.serendipity.pojo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Users {
    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
