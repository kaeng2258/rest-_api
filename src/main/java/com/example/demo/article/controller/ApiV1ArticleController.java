package com.example.demo.article.controller;


import com.example.demo.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
@RequiredArgsConstructor
public class ApiV1ArticleController {

    private final ArticleService articleService;

    @GetMapping("")
    public String list(){
        return "list";
    }
    @GetMapping("/{id}")
    public String getArticle(){
        return "one";
    }
    @PostMapping("")
    public String crete(){
        return "";
    }

    @PatchMapping("/{id}")
    public String modify(){
        return "";
    }

    @DeleteMapping("{id}")
    public String delete(){
        return "";
    }
}
