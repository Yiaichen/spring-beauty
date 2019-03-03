package com.hucheng.beauty.controller;

import com.hucheng.beauty.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/learn")
public class MainController {

//    @Autowired
//    private Image iamge;

    @RequestMapping("")
    public List<Image> index(){

        List<Image> learnList =new ArrayList<Image>();

        Image bean =new Image("1","chen","1","情头","vayi","./static/images/01.jpg");
        learnList.add(bean);
        bean =new Image("2","chen","1","情头","vayi","./static/images/02.jpg");
        learnList.add(bean);
        bean =new Image("3","chen","1","情头","vayi","./static/images/04.jpg");
        learnList.add(bean);
        bean =new Image("4","chen ","1","情头","vayi","./static/images/03.jpg");
        learnList.add(bean);
        bean =new Image("5","chen","1","情头","vayi","./static/images/05.jpg");
        learnList.add(bean);
        bean =new Image("6","chen","1","情头","vayi","./static/images/06.jpg");
        learnList.add(bean);
        bean =new Image("7","chen","1","情头","vayi","./static/images/07.jpg");
        learnList.add(bean);
        bean =new Image("8","chen","1","情头","vayi","./static/images/08.jpg");
        learnList.add(bean);
//        ModelAndView modelAndView = new ModelAndView("/beautyDetail");
//        modelAndView.addObject("resultList", learnList);
        return learnList;
    }

    @RequestMapping("/t")
    public List<Image> index2(){

        List<Image> learnList =new ArrayList<Image>();

        Image bean =new Image("1","chen","1","情头","vayi","/images/01.jpg");
        learnList.add(bean);
        bean =new Image("2","chen","1","情头","vayi","/images/02.jpg");
        learnList.add(bean);
        bean =new Image("3","chen","1","情头","vayi","/images/03.jpg");
        learnList.add(bean);
        bean =new Image("4","chen ","1","情头","vayi","/images/04.jpg");
        learnList.add(bean);
        bean =new Image("5","chen","1","情头","vayi","/images/05.jpg");
        learnList.add(bean);
        bean =new Image("6","chen","1","情头","vayi","/images/06.jpg");
        learnList.add(bean);
        bean =new Image("7","chen","1","情头","vayi","/images/07.jpg");
        learnList.add(bean);
        bean =new Image("8","chen","1","情头","vayi","/images/08.jpg");
        learnList.add(bean);
        bean =new Image("9","chen","1","情头","vayi","/images/09.jpg");
        learnList.add(bean);
//        ModelAndView modelAndView = new ModelAndView("/template");
//        modelAndView.addObject("resultList", learnList);
        return learnList;
    }

}