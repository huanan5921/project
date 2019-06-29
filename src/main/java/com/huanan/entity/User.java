package com.huanan.entity;/*
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　┻　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　佛主保佑 　┣┓
 * 　　　　┃　　永无BUG 　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┗┻┛　┗┻┛
 * Created by 华南 on 2019/6/27.
 */

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.huanan.common.CustomDateSerializer;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户实体
 */

@Entity
@Table(name="t_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id; //编号

    @Column(length = 100)
    private String userName;    //用户名

    @Column(length = 100)
    private String password;    //密码

    @Column(length = 100)
    private String email;   //验证邮箱地址

    @Column(length = 100)
    private String imageName;   //用户头像

    @Column(length = 100)
    private Integer points=0;   //用户积分

    @Column(length = 100)
    private boolean isOff=false;    //是否封禁

    @Column(length = 100)
    private boolean isVIP=false;    //是否VIP

    @Column(length = 100)
    private String roleName="会员";   //只有两种角色：会员、管理员。默认会员

    @Column(length = 100)
    private Date registerDate;  //注册时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public boolean isOff() {
        return isOff;
    }

    public void setOff(boolean off) {
        isOff = off;
    }

    public boolean isVIP() {
        return isVIP;
    }

    public void setVIP(boolean VIP) {
        isVIP = VIP;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
}
