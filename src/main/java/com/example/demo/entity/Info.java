package com.example.demo.entity;

public class Info {
    private int infoid;
    private String name;
    private String birthday;
    private String mianmao;
    private String phonenumber;
    private String address;

    public int getInfoid() {
        return infoid;
    }

    public void setInfoid(int infoid) {
        this.infoid = infoid;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMianmao() {
        return mianmao;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setMianmao(String mianmao) {
        this.mianmao = mianmao;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Info{" +
                "infoid=" + infoid +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", mianmao='" + mianmao + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
