package com.example.demo.mapper;

import com.example.demo.entity.Intro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IntroMapper {
    List<Intro> queryAllIntro(int userid);
    void updateIntro(Intro intro);
}
