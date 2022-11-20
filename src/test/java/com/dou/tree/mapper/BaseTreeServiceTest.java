package com.dou.tree.mapper;

import com.dou.tree.entity.BaseTree;
import com.dou.tree.service.BaseTreeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BaseTreeServiceTest {

    @Autowired
    private BaseTreeServiceImpl baseTreeService;

    @Test
    public void getBaseTreeService() {
        BaseTree baseTree = new BaseTree();
        baseTree.setId("2");
        baseTree.setName("父节点");
        int insert = baseTreeService.add(baseTree);
        System.out.println(insert > 0 ? "成功" : "失败");
    }

    @Test
    public void get() {
        BaseTree baseTree = baseTreeService.getById("1");
        System.out.println(baseTree);
    }

    @Test
    void add() {
    }

    @Test
    void update() {
    }

    @Test
    void getAll() {
        baseTreeService.getAll();
    }

    @Test
    void getById() {
    }

    @Test
    void deleteById() {
    }
}