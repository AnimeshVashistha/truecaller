package com.example.animesh.truecaller.model;

public class TrueCaller {

    private String name, email, phone, group;
    private int id;


    public TrueCaller(int id, String name, String email, String phone, String group) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
