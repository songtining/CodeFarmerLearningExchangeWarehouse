package com.etoak.pojo;

public class User {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
