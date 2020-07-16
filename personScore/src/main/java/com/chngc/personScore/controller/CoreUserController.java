package com.chngc.personScore.controller;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;
import com.chngc.personScore.entity.CoreUser;
import com.chngc.personScore.service.CoreUserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * (CoreUser)表控制层
 *
 * @author makejava
 * @since 2020-06-28 11:44:39
 */
@Api(tags = "用户相关api")
@RestController
@RequestMapping("/coreUser")
public class CoreUserController {
    /**
     * 服务对象
     */
    @Resource
    private CoreUserService coreUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation(value = "查询单个会员", notes = "查询单个会员，00：成功，01：失败")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "id", value = "会员id")
    })
    @GetMapping("/getOne")
    public CoreUser getOne(String id) {
       File file =  new File("E:\\部署\\实人认证-readme.txt");

        FileReader fileReader = new FileReader("E:\\部署\\实人认证-readme.txt","GBK");
        fileReader.readLines().stream().forEach(item ->{
               System.out.println(item.toString());
            }
        );
        return this.coreUserService.queryById(id);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne/{id}")
    public CoreUser selectOne(@PathVariable String id) {
        return this.coreUserService.selectById(id);
    }

    @PostMapping("/order/sendOrder")
    public CoreUser sendOrder(){
        System.out.println("======进入order/sendOrder");
        return new CoreUser();
    }

}