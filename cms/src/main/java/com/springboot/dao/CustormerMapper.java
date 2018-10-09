package com.springboot.dao;

import com.springboot.dataobject.Department;
import com.springboot.dataobject.Position;
import com.springboot.dataobject.Employee;
import com.springboot.vo.BusinessAndProductVO;
import com.springboot.vo.MenuVO;
import com.springboot.dto.EmployeeDTO;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/9/28 0028.
 */
public interface CustormerMapper {
    @Results(id = "menuMap", value = {@Result(column = "MENU_ID", property = "menu_id", javaType = Integer.class),
            @Result(column = "MENU_NAME", property = "menu_name", javaType = String.class),
            @Result(column = "MENU_URL", property = "menu_url", javaType = String.class),
            @Result(column = "PARENT_MENU_ID", property = "parent_menu_id", javaType = Integer.class),
            @Result(column = "PICTURES", property = "pictures", javaType = String.class)
    })
    @Select("SELECT menu_id,menu_name,parent_menu_id,menu_url FROM menu WHERE menu_id IN (SELECT menu_id FROM  position_menu_relations WHERE position_id=(SELECT positon_id FROM employee WHERE employee_id=#{employee_id})) AND parent_menu_id!=''")
    List<MenuVO> selectSonMenu(Integer employee_id);

    @ResultMap("menuMap")
    @Select("SELECT menu_id,menu_name,menu_url,pictures FROM menu WHERE menu_id in (SELECT menu_id FROM  position_menu_relations WHERE position_id=(SELECT positon_id FROM employee WHERE employee_id=#{employee_id})) AND pictures!=''")
    List<MenuVO> selectFather(Integer id);

    @Select("SELECT result.parent_employee_id,result.employee_id,result.employee_name,result.department_name,ep.position_name,result.phone,result.email,result.status,result.create_time,result.update_time FROM " +
            "(SELECT em.parent_employee_id,em.positon_id,em.employee_id,em.employee_name,de.department_name,em.phone,em.email,em.status,em.create_time,em.update_time FROM employee em right JOIN department de ON  em.department_id=de.department_id AND  em.employee_id IN (SELECT employee_id FROM employee)) result " +
            "INNER JOIN emm_position ep ON ep.position_id=result.positon_id")
    @Results(id = "employee", value = {
            @Result(column = "employee_id", property = "employee_id", javaType = Integer.class),
            @Result(column = "employee_name", property = "employee_name", javaType = String.class),
            @Result(column = "department_name", property = "department_name", javaType = String.class),
            @Result(column = "position_name", property = "position_name", javaType = String.class),
            @Result(column = "phone", property = "phone", javaType = String.class),
            @Result(column = "email", property = "email", javaType = String.class),
            @Result(column = "status", property = "status", javaType = Integer.class),
            @Result(column = "parent_employee_id", property = "parent_employee_id", javaType = Integer.class),
            @Result(column = "create_time", property = "create_time", javaType = Date.class),
            @Result(column = "update_time", property = "update_time", javaType = Date.class),
    })
    List<Employee> selectEmployeeMange();

    @Select("SELECT result.parent_employee_id,result.employee_id,result.employee_name,result.department_name,ep.position_name,result.phone,result.email,result.status,result.create_time,result.update_time FROM " +
            "(SELECT em.parent_employee_id,em.positon_id,em.employee_id,em.employee_name,de.department_name,em.phone,em.email,em.status,em.create_time,em.update_time FROM employee em right JOIN department de ON  em.department_id=de.department_id AND  em.employee_id = #{employee_id} AND em.employee_name=#{employee_name} ) result " +
            "INNER JOIN emm_position ep ON ep.position_id=result.positon_id")
    @ResultMap("employee")
    Employee selectEmployeeByIdAndName(@Param("employee_id") Integer employee_id, @Param("employee_name") String employee_name);

    @Update("UPDATE employee SET status = 0 where employee_id =(SELECT result1.employee_id FROM(SELECT result.employee_id,result.status FROM (SELECT em.positon_id,em.employee_id,em.status FROM employee em right JOIN department de ON  em.department_id=de.department_id AND  em.employee_id=#{employee_id}) result INNER  JOIN emm_position ep ON ep.position_id=result.positon_id) result1)")
    Integer updateEmployeeStatus(Integer emplpyee_id);

    @Update("UPDATE employee SET status = 1 where employee_id =(SELECT result1.employee_id FROM(SELECT result.employee_id,result.status FROM (SELECT em.positon_id,em.employee_id,em.status FROM employee em right JOIN department de ON  em.department_id=de.department_id AND  em.employee_id=#{employee_id}) result INNER  JOIN emm_position ep ON ep.position_id=result.positon_id) result1)")
    Integer updateEmployeeBanStatus(Integer emplpyee_id);

    @Select("SELECT department_name FROM department")
    List<Department> getDepartList();

    @Select("SELECT position_name FROM emm_position")
    List<Position> getPositionList();

    @Select("SELECT employee_id FROM employee WHERE employee_id=#{employee_id}")
    @ResultMap("employee")
    Employee isExistParentEmployeeId(Integer employeeId);

    @Select("update employee em, emm_position epo,department de SET em.department_id=#{department_id},em.employee_name=#{employee_name},em.phone=#{phone},em.email=#{email},em.parent_employee_id=#{parent_employee_id}, em.positon_id=#{positon_id} WHERE epo.position_id=em.positon_id AND em.employee_id=#{employee_id} AND em.positon_id=epo.position_id")
    Integer updateEmployee(EmployeeDTO employee);

    @Select("SELECT department_id FROM department WHERE department_name=#{department_name}")
    Integer selectByDepartmentName(String department_name);

    @Select("SELECT position_id FROM emm_position WHERE position_name=#{position_name}")
    Integer selectByPositionName(String position_name);

    @Insert("INSERT INTO employee(employee_name,department_id,positon_id,phone,email,parent_employee_id) VALUES(#{employee_name},#{department_id},#{positon_id},#{phone},#{email},#{parent_employee_id})")
    @Options(useGeneratedKeys = true, keyProperty = "employee_id", keyColumn = "employee_id")
//返回自增主键
    Integer insertEmployee(EmployeeDTO employeeDTO);

    @Insert("INSERT INTO log_in(employee_id,emm_password) VALUES(#{employee_id},#{emm_password})")
    Integer insertUserCount(@Param("employee_id") Integer employee_id, @Param("emm_password") String emm_password);

    @Select("select count(*) from customer where DATE_SUB(CURDATE(), INTERVAL 7 DAY) <= date(CREATE_TIME);")
    Integer selectWeekRecord();

    @Select("select count(*) from customer where DATE_SUB(CURDATE(), INTERVAL 1 MONTH) <= date(CREATE_TIME);")
    Integer selectMonthRecord();

    @Select("SELECT * FROM " +
            "(SELECT  result2.employee_id,bte.type_name,result2.update_time,result2.business_name,result2.source_name,result2.name " +
            "FROM " +
            "(SELECT result1.employee_id,result1.business_type_id,result1.update_time,result1.business_name,result1.source_name,lm.name " +
            "FROM (SELECT bs.employee_id,bs.business_type_id,bs.update_time,bs.business_name,bse.source_name,bs.link_main_id FROM business bs LEFT JOIN business_source bse ON bs.business_source_id=bse.SOURCE_ID) result1 " +
            "LEFT JOIN link_man lm ON result1.link_main_id=lm.link_main_id) result2 " +
            "LEFT JOIN business_type bte ON bte.type_id=result2.business_type_id " +
            ") result3 WHERE DATE_SUB(CURDATE(), INTERVAL 1 MONTH) <= date(update_time) AND employee_id=#{employee_id};")
    List<BusinessAndProductVO> selectInfo(Integer employee_id);

}
