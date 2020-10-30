package com.youngforcoding.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.youngforcoding.blog.domain.Article;

/**
 * @author linzhihao <linzhihao@kuaishou.com>
 * Created on 2020-10-29
 */
@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM t_article limit #{startPageNum},#{limitNum}")
    List<Article> listByPage(Long startPageNum, Long limitNum);

    @Select("select count(id) from t_article")
    Long countAll();
}
