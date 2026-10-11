package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

public interface DishService {

//    /**
//     * 菜品分页查询
//     * @param dishPageQueryDTO
//     * @return
//     */
//    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     * @return
     */
    void saveWithFlavor(DishDTO dishDTO);
}
