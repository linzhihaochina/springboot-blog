package com.youngforcoding.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youngforcoding.blog.dao.ArticleMapper;
import com.youngforcoding.blog.domain.Article;

/**
 * @author linzhihao <linzhihao@kuaishou.com>
 * Created on 2020-10-29
 */
@Service
public class BlogService {

    private final static long PAGE_SIZE = 4;

    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> listBlogByPage(long pageNum) {
        long startPageNum = (pageNum - 1) * PAGE_SIZE;
        System.out.println(startPageNum);
        return articleMapper.listByPage(startPageNum, PAGE_SIZE);
    }

    public long lastPageNum() {
        return (articleMapper.countAll() / PAGE_SIZE) + 1;
    }

}
