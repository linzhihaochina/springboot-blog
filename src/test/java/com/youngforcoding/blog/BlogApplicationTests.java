package com.youngforcoding.blog;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.youngforcoding.blog.dao.ArticleMapper;
import com.youngforcoding.blog.domain.Article;

@RunWith(SpringRunner.class)
@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void contextLoads() {
        List<Article> articles = articleMapper.listByPage(0L, 1L);
        System.out.println(articles);
    }

}
