package com.dou.tree.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Objects;


/**
 * 最基本的树结构 字段设计
 *
 * @author doulongfei
 * @date 2022/10/24
 */
@TableName(value = "base_tree")//指定表名
public class BaseTree implements Serializable {
    private String id;
    private String name;
    private String parentId;

    public BaseTree(String id, String name, String parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public BaseTree() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseTree baseTree = (BaseTree) o;
        return Objects.equals(id, baseTree.id) && Objects.equals(name, baseTree.name) && Objects.equals(parentId, baseTree.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, parentId);
    }

    @Override
    public String toString() {
        return "BaseTree{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                '}';
    }
}
