package com.dou.tree.service;

import com.dou.tree.entity.BaseTree;

import java.util.List;

public interface BaseTreeService {

    int add(BaseTree tree);

    void update(BaseTree tree);

    List<BaseTree> getAll();

    BaseTree getById(String id);

    void deleteById(String id);

}
