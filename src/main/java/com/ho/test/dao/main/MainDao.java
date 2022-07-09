package com.ho.test.dao.main;

import com.ho.test.dto.main.MainDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainDao {
    public List<MainDto> selectTopFive();
}
