package com.chngc.personScore.service;

import com.chngc.personScore.entity.CoreUser;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * (CoreUser)表服务接口
 *
 * @author makejava
 * @since 2020-06-28 11:44:38
 */
@Component
public interface CoreUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    CoreUser queryById(String userId);

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    CoreUser selectById(String userId);

}