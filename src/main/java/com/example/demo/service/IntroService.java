package com.example.demo.service;

import com.example.demo.entity.Intro;
import com.example.demo.mapper.IntroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntroService {

    @Autowired
    public IntroMapper intromapper;
    public List<Intro> queryAllIntro(int userid){
        List<Intro> intro = null;
        try{
            intro = intromapper.queryAllIntro(userid);
        }catch (Exception e){
            e.printStackTrace();
        }
        return intro;
    }

    public void updateIntro(Intro intro){
        try{
            intromapper.updateIntro(intro);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
