package com.itheima.controller;

import com.itheima.pojo.Article;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @PostMapping
    public Result add(@RequestBody @Validated Article article){
        articleService.add(article);
        return Result.success();
    }

    @GetMapping
    public Result<PageBean<Article>>list(
            Integer pageNum,
            Integer pageSize,
            @RequestParam(required = false) Integer categoryId,
            @RequestParam(required = false)String state
    ){
        PageBean<Article> pd = articleService.list(pageNum,pageSize,categoryId,state);
        return Result.success(pd);
    }
    @GetMapping("/detail")
    public Result<Article> detail(Integer id){
        Article a = articleService.findById(id);
        return Result.success(a);
    }
    @PutMapping
    public Result update(@RequestBody @Validated(Article.Update.class) Article article){
        articleService.update(article);
        return Result.success();
    }
    @DeleteMapping
    public Result delete(Integer id){
        articleService.deleteById(id);
        return Result.success();
    }
}
