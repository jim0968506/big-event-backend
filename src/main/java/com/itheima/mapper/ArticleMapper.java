package com.itheima.mapper;

import com.itheima.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
//    新增
    @Insert("insert into article (title,content,cover_img,state,category_id,create_user,create_time,update_time)"+
            "values(#{title},#{content},#{coverImg},#{state},#{categoryId},#{createUser},#{createTime},#{updateTime})")
    void add(Article article);
    List<Article> list(Integer userId, Integer categoryId, String state);
//    根據ID查詢
    @Select("select * from article where id=#{id}")
    Article findById(Integer id);
//更新文章
    @Update("update article set title=#{title},content=#{content},state=#{state},category_id=#{categoryId},update_time=#{updateTime} where id=#{id}")
    void update(Article article);
//刪除文章
    @Delete("delete from article where id=#{id}")
    void deleteById(Integer id);
}
