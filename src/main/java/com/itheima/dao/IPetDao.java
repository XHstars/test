package com.itheima.dao;

import com.itheima.domain.Pet;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 宠物的持久层接口
 * @author 11421
 */
public interface IPetDao {

    /**
     * 查询所有宠物
     * @return 宠物集合
     */
    List<Pet> findAll();
}
