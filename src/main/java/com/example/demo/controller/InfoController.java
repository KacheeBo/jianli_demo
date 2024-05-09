package com.example.demo.controller;

import com.example.demo.entity.Info;
import com.example.demo.entity.Intro;
import com.example.demo.entity.User;
import com.example.demo.service.InfoService;
import com.example.demo.service.IntroService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class InfoController {

    int userid;

    @Autowired
    InfoService infoService;

    @Autowired
    UserService userService;

    @Autowired
    IntroService introService;

    @RequestMapping("login")
    @ResponseBody
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user;
        user = userService.queryById(username,password);
        if (user==null) {
            return "error";
        }else{
            userid = user.getId();
            System.out.println("username=" + username + ";password=" + password);
            return "1";
        }
    }

    //用户注册
    @RequestMapping("register")
    @ResponseBody
    public String register(@RequestParam("username") String username,@RequestParam("password") String password){
        System.out.println("username="+username + "password="+password);
        if (userService.getUsername(username)==null) {
            userService.save(username, password);
            return "1";
        }else{
            return "false";
        }
    }


    //显示出个人信息
    @RequestMapping("/Info")
    @ResponseBody
    public List<Info> getInfo(){
        System.out.println(infoService.queryAll(userid));
//        System.out.println("111");
        return infoService.queryAll(userid);
    }

    //基本信息编辑
    @RequestMapping("/InfoUpdate")
    @ResponseBody
    public void updateInfo(Info info){
        info.setInfoid(userid);
        infoService.updateInfo(info);
        System.out.println(info);
    }

    //查询个人介绍
    @RequestMapping("/Intro")
    @ResponseBody
    public List<Intro> getIntro(){
        System.out.println(introService.queryAllIntro(userid));
        return  introService.queryAllIntro(userid);
    }
    //编辑个人介绍
    @RequestMapping("/introductionUpdate")
    @ResponseBody
    public void updateIntro(Intro intro){
        intro.setIntroid(userid);
        introService.updateIntro(intro);
        System.out.println(intro);
    }
}
