package com.chngc.personScore.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chngc.personScore.entity.CoreUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * (CoreUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-28 11:44:37
 */
@Mapper
public interface CoreUserMapper extends BaseMapper<CoreUser> {

    CoreUser queryById(String userId);

}