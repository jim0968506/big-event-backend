package com.itheima.service;

import com.itheima.pojo.Category;

import java.util.List;

public interface CategoryService {
//    新增分類
    void add(Category category);
//列表查詢
    List<Category> list();
//根據id查詢分類信息
    Category finById(Integer id);

//更新分類
    void update(Category category);
//刪除分類
    void deleteById(Integer id);
}
