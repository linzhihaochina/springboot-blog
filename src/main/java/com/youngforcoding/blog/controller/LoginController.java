package com.youngforcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author linzhihao <linzhihao@kuaishou.com>
 * Created on 2020-10-29
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "test";
    }

}
