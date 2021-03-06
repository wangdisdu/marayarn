package com.eoi.marayarn.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.eoi.marayarn.web.entity.db.Application;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by wenbo.gong on 2020/9/29
 */
@Mapper
@Repository
public interface ApplicationMapper extends BaseMapper<Application> {

}
