package com.itheima.service;

import com.itheima.pojo.Article;
import com.itheima.pojo.PageBean;

public interface ArticleService {
//    新增文章
    void add(Article article);
//條件分業列表查詢
    PageBean<Article> list(Integer pageNum, Integer pageSize, Integer categoryId, String state);
}
