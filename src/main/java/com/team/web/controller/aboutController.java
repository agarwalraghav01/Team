package com.team.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by raghav on 8/3/17.
 */
@Controller
public class aboutController {
    @RequestMapping("/about")
    public String aboutPage() {
        return "copy/about";
    }
}
