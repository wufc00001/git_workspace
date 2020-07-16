package com.chngc.personScore.service.impl;

import com.chngc.personScore.entity.CoreUser;
import com.chngc.personScore.dao.CoreUserMapper;
import com.chngc.personScore.service.CoreUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CoreUser)表服务实现类
 *
 * @author makejava
 * @since 2020-06-28 11:44:39
 */
@Service("coreUserService")
public class CoreUserServiceImpl implements CoreUserService {
    @Resource
    private CoreUserMapper coreUserMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public CoreUser queryById(String userId) {
        return coreUserMapper.queryById(userId);
    }

    @Override
    public CoreUser selectById(String userId) {
        return coreUserMapper.selectById(userId);
    }


}