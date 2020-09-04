package com.panda.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
    private String id;
    private String name;
    private String  birth;
    private String sex;

    public User() {
    }

    public User(String id, String name, String birth, String sex) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
