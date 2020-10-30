package com.youngforcoding.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.youngforcoding.blog.service.BlogService;

/**
 * @author linzhihao <linzhihao@kuaishou.com>
 * Created on 2020-10-29
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model, @RequestParam(value = "pageNum", defaultValue = "1") long pageNum) {
        long lastPageNum = blogService.lastPageNum();
        if (pageNum <= 0) {
            pageNum = 1;
        } else if (pageNum > lastPageNum) {
            pageNum = lastPageNum;
        }
        model.addAttribute("blogs", blogService.listBlogByPage(pageNum));
        model.addAttribute("currentPageNum", pageNum);
        model.addAttribute("lastPageNum", lastPageNum);
        return "index";
    }

}
