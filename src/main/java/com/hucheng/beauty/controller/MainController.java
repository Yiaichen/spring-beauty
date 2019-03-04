package com.hucheng.beauty.controller;

import com.hucheng.beauty.entity.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页控制器
 *
 * @author  vayi
 * @date 2019/03/04
 * @version 1.0
 */
@RestController
@RequestMapping("/main")
public class MainController {


    @RequestMapping("/findBanner")
    public List<Image> findBanner(){

        List<Image> learnList =new ArrayList<Image>();

        Image bean =new Image("1","chen","1","Banner","vayi","./static/images/Banner/05.jpg");
        learnList.add(bean);
        bean =new Image("2","chen","1","Banner","vayi","./static/images/Banner/07.jpg");
        learnList.add(bean);
        bean =new Image("3","chen","1","Banner","vayi","./static/images/Banner/06.jpg");
        learnList.add(bean);
        return learnList;
    }

    @RequestMapping("/findLover")
    public List<Image> findLover(){

        List<Image> learnList =new ArrayList<Image>();

        Image bean =new Image("1","chen","Lover","情头","vayi","./static/images/01.jpg");
        learnList.add(bean);
        bean =new Image("2","chen","Lover","情头","vayi","./static/images/02.jpg");
        learnList.add(bean);
        bean =new Image("3","chen","Lover","情头","vayi","./static/images/04.jpg");
        learnList.add(bean);
        bean =new Image("4","chen ","Lover","情头","vayi","./static/images/03.jpg");
        learnList.add(bean);
        bean =new Image("5","chen","Lover","情头","vayi","./static/images/05.jpg");
        learnList.add(bean);
        bean =new Image("6","chen","Lover","情头","vayi","./static/images/06.jpg");
        learnList.add(bean);
        bean =new Image("7","chen","Lover","情头","vayi","./static/images/07.jpg");
        learnList.add(bean);
        bean =new Image("8","chen","Lover","情头","vayi","./static/images/08.jpg");
        learnList.add(bean);
        return learnList;
    }

}