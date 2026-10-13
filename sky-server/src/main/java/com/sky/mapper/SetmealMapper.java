package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface SetmealMapper {
    /**
     * 根据分类id查询套餐
     */
    @Select("select * from setmeal where category_id = #{categoryId}")
    List<Setmeal> getByCategoryId(Long categoryId);

    /**
     * 套餐分类查询
     */
    Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    /**
     * 状态修改
     * @param status
     * @param id
     * @return
     */
    @Update("update setmeal set status = #{status} where id = #{id}")
    void status(Integer status, Long id);


}
