package com.qf.manager.web;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Random;

/**
 * Created by yyn on 2018/5/22.
 */
@Controller
public class ManagerIndexAction {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/login")
    public String login(Model model){
        int count=5;

        model.addAttribute("count",count);
        return "index";
    }

}
