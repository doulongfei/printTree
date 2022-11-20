package com.dou.tree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dou.tree.entity.BaseTree;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface BaseTreeMapper extends BaseMapper<BaseTree> {
}
