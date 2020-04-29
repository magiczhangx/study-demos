package com.example.web.dao.mappers;

import com.example.web.dao.dos.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface CityMapper {

    //@Select("SELECT * FROM city WHERE id = #{id}")
    City getCityById(@Param("id") int id);

    @Select("SELECT * FROM city WHERE id = #{id}")
    City getCityById2(@Param("id") int id);

}
