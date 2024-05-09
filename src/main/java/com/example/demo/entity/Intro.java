package com.example.demo.entity;

public class Intro {
    private int introid;
    private String intro;

    public int getIntroid() {
        return introid;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntroid(int introid) {
        this.introid = introid;
    }

    @Override
    public String toString() {
        return "Intro{" +
                "introid=" + introid +
                ", intro='" + intro + '\'' +
                '}';
    }
}
