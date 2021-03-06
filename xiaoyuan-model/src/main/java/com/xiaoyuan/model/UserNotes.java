package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tl_school_user_notes")
@Repository
public class UserNotes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 登录时间
     */
    private Date logintime;

    /**
     * 登出时间
     */
    private Date logouttime;

    /**
     * 登录IP地址
     */
    private String ipaddress;

    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.user_id
     *
     * @param userId the value for tl_school_user_notes.user_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_notes.user_name
     *
     * @return the value of tl_school_user_notes.user_name
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.user_name
     *
     * @param userName the value for tl_school_user_notes.user_name
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_notes.password
     *
     * @return the value of tl_school_user_notes.password
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.password
     *
     * @param password the value for tl_school_user_notes.password
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_notes.logintime
     *
     * @return the value of tl_school_user_notes.logintime
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.logintime
     *
     * @param logintime the value for tl_school_user_notes.logintime
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_notes.logouttime
     *
     * @return the value of tl_school_user_notes.logouttime
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getLogouttime() {
        return logouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.logouttime
     *
     * @param logouttime the value for tl_school_user_notes.logouttime
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setLogouttime(Date logouttime) {
        this.logouttime = logouttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_notes.ip-adress
     *
     * @return the value of tl_school_user_notes.ip-adress
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_notes.ip-adress
     *
     * @param ipAdress the value for tl_school_user_notes.ip-adress
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setIpAdress(String ipAdress) {
        this.ipaddress = ipAdress == null ? null : ipAdress.trim();
    }


}
