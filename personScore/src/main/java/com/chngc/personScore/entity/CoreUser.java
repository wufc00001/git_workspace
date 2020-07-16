package com.chngc.personScore.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;
import java.io.Serializable;

/**
 * (CoreUser)实体类
 *
 * @author makejava
 * @since 2020-06-28 11:44:32
 */
@Data
@TableName(value = "core_user")
public class CoreUser implements Serializable {
    private static final long serialVersionUID = 236451822762313360L;
    @TableId(value = "user_id",type = IdType.AUTO)
    private String userId;

    private String userType;
    
    private String departmentId;
    
    private String brandId;
    
    private String realname;
    
    private String title;
    
    private String loginName;
    
    private String password;
    
    private String pwdQuestion;
    
    private String pwdAnswer;
    
    private String email;
    
    private String status;
    
    private String creUser;
    
    private String modUser;
    
    private Date creTime;
    
    private Date modTime;
    
    private String mobile;
    
    private String isEditEmail;
    
    private String isMobileCheck;
    
    private String position;


}