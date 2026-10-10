package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 员工新增
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @param employeePageQueryDTO
     * @return
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 员工状态转换
     * @param status
     * @param id
     */
    void EmployyStatus(Integer status, Long id);

    /**
     * 员工编辑
     * @param employeeDTO
     */
    void editEmployee(EmployeeDTO employeeDTO);

    /**
     * 根据id查员工
     * @param id
     * @return
     */
    Employee employeeGetById(Long id);
}
