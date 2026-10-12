package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {

    /**
     * 新增菜品和对应的口味数据
     * @param dishDTO
     * @return
     */
    void saveWithFlavor(DishDTO dishDTO);

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 批量删除菜品
     * @param ids
     * @return
     */
    void delete(List<Long> ids);

    /**
     * 修改菜品状态
     * @param status
     * @return
     */
    void status(Integer status, Long id);

    /**
     * 根据id查询菜品
     * @param id
     * @return
     */
    DishVO getById(Long id);

    /**
     * 修改菜品
     * @param dishDTO
     * @return
     */
    void update(DishDTO dishDTO);
}
