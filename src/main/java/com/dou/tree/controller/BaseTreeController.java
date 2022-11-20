package com.dou.tree.controller;

import com.dou.tree.entity.BaseTree;
import com.dou.tree.service.BaseTreeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/baseTree")
public class BaseTreeController {

    @Autowired
    private BaseTreeServiceImpl baseTreeService;

    @GetMapping
    public List<BaseTree> getAll(){
        List<BaseTree> all = baseTreeService.getAll();
        return all;
    }

}
