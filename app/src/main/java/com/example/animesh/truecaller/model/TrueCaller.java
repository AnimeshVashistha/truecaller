package com.example.animesh.truecaller.model;

public class TrueCaller {

    private String name,email,phone,group;

    public TrueCaller(String name, String email, String phone, String group) {
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

    @Override
    public String toString() {
        return "TrueCaller{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
