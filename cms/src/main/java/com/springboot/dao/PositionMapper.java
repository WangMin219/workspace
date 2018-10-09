package com.springboot.dao;

import com.springboot.dataobject.Position;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/1 0001.
 */

public interface PositionMapper {

    @Select("SELECT position_id,position_name,position_level,create_time,update_time FROM emm_position")
    List<Position> getAllPosition();

    @Select("SELECT position_id FROM emm_position WHERE position_name=#{position_name}")
    @Results(id = "positionMap", value = {@Result(column = "position_id", property = "position_id", javaType = Integer.class),
    })
    Position isExistPostion(String position_name);

    @Insert("INSERT INTO emm_position(position_name,position_level) VALUES(#{position_name},#{position_level})")
    Integer insertPosition(Position position);

    @Select("SELECT position_id,position_name,position_level,create_time,update_time FROM emm_position WHERE position_name=#{position_name}")
    @Results(id = "position", value = {
            @Result(column = "position_id", property = "position_id", javaType = Integer.class),
            @Result(column = "position_name", property = "position_name", javaType = String.class),
            @Result(column = "position_level", property = "position_level", javaType = String.class),
            @Result(column = "create_time", property = "create_time", javaType = Date.class),
            @Result(column = "update_time", property = "update_time", javaType = Date.class),
    })
    Position searchPosition(String position_name);

    @Select("SELECT * FROM emm_position WHERE position_name=#{position_name}")
    @ResultMap("position")
    Position selectPositionByNameAndLevel(Position position);


    @Update("UPDATE emm_position SET position_name=#{position_name},position_level=#{position_level} WHERE position_id=#{position_id}")
    Integer updatePosition(Position position);

    @Delete("DELETE FROM emm_position WHERE position_id=#{position_id}")
    Integer deletePositionById(Integer position_id);


}
