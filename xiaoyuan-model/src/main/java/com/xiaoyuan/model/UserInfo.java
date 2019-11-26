package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("tl_school_user_info")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号码
     */
    private Integer mobliephone;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 用户角色
     */
    private String role;

    /**
     * 用户权限
     */
    private String permission;

    /**
     * 时间戳
     */
    private Date createTime;

    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.user_id
     *
     * @param userId the value for tl_school_user_info.user_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.username
     *
     * @return the value of tl_school_user_info.username
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.username
     *
     * @param username the value for tl_school_user_info.username
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.password
     *
     * @return the value of tl_school_user_info.password
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.password
     *
     * @param password the value for tl_school_user_info.password
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.mobliephone
     *
     * @return the value of tl_school_user_info.mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getMobliephone() {
        return mobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.mobliephone
     *
     * @param mobliephone the value for tl_school_user_info.mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setMobliephone(Integer mobliephone) {
        this.mobliephone = mobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.status
     *
     * @return the value of tl_school_user_info.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.status
     *
     * @param status the value for tl_school_user_info.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.role
     *
     * @return the value of tl_school_user_info.role
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.role
     *
     * @param role the value for tl_school_user_info.role
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.permission
     *
     * @return the value of tl_school_user_info.permission
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.permission
     *
     * @param permission the value for tl_school_user_info.permission
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_user_info.create_time
     *
     * @return the value of tl_school_user_info.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_user_info.create_time
     *
     * @param createTime the value for tl_school_user_info.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
