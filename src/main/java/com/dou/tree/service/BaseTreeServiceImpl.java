package com.dou.tree.service;

import com.dou.tree.entity.BaseTree;
import com.dou.tree.mapper.BaseTreeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseTreeServiceImpl implements BaseTreeService {

    private final BaseTreeMapper baseTreeMapper;

    public BaseTreeServiceImpl(BaseTreeMapper baseTreeMapper) {
        this.baseTreeMapper = baseTreeMapper;
    }

    @Override
    public int add(BaseTree tree) {
        return baseTreeMapper.insert(tree);
    }

    @Override
    public void update(BaseTree tree) {
        baseTreeMapper.updateById(tree);
    }

    @Override
    public List<BaseTree> getAll() {
        List<BaseTree> baseTrees = baseTreeMapper.selectList(null);

        return baseTrees;
    }

    @Override
    public BaseTree getById(String id) {
        BaseTree baseTree = baseTreeMapper.selectById(id);
        return baseTree;
    }

    @Override
    public void deleteById(String id) {
        baseTreeMapper.deleteById(id);
    }
}
