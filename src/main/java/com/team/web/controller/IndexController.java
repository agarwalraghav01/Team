package com.team.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raghav on 6/3/17.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

}
