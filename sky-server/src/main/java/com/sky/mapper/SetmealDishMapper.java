package com.sky.mapper;


import com.sky.annotation.AutoFill;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id批量查询菜品和套餐关系
     * @param ids
     * @return
     */
    List<SetmealDish> queryDishAndSetmeal(List<Long> ids);

    /**
     * 根据id查询菜品状态
     * @return
     */
    @Select("select count(*) from setmeal_dish s join dish d on s.dish_id = d.id " +
            "where d.status = 0 and s.setmeal_id = #{id}")
    int queryDishStatus(Long id);

    /**
     * 根据菜品id找套餐id
     * @param id
     * @return
     */
    @Select("select s.setmeal_id from setmeal_dish s where dish_id = #{id}")
    Long querySetmealId(Long id);

    @AutoFill(value = OperationType.INSERT)
    void insert();
}
