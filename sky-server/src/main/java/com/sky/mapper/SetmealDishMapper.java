package com.sky.mapper;


import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id批量查询菜品和套餐关系
     * @param ids
     * @return
     */
    List<SetmealDish> queryDishAndSetmeal(List<Long> ids);

}
