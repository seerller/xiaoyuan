package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalTime;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("tl_school_amusement")
public class Amusement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer amusemenId;

    @TableField("school_ID")
    private Integer schoolId;

    private String amusementname;

    private String type;

    private String videoname;

    private Date time;

    private String status;

    private Date createTime;

    public Integer getAmusemenId() {
        return amusemenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.amusemen_id
     *
     * @param amusemenId the value for tl_school_amusement.amusemen_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setAmusemenId(Integer amusemenId) {
        this.amusemenId = amusemenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.school_ID
     *
     * @return the value of tl_school_amusement.school_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.school_ID
     *
     * @param schoolId the value for tl_school_amusement.school_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.amusementname
     *
     * @return the value of tl_school_amusement.amusementname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getAmusementname() {
        return amusementname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.amusementname
     *
     * @param amusementname the value for tl_school_amusement.amusementname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setAmusementname(String amusementname) {
        this.amusementname = amusementname == null ? null : amusementname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.type
     *
     * @return the value of tl_school_amusement.type
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.type
     *
     * @param type the value for tl_school_amusement.type
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.videoname
     *
     * @return the value of tl_school_amusement.videoname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getVideoname() {
        return videoname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.videoname
     *
     * @param videoname the value for tl_school_amusement.videoname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.time
     *
     * @return the value of tl_school_amusement.time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.time
     *
     * @param time the value for tl_school_amusement.time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.status
     *
     * @return the value of tl_school_amusement.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.status
     *
     * @param status the value for tl_school_amusement.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_amusement.create_time
     *
     * @return the value of tl_school_amusement.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_amusement.create_time
     *
     * @param createTime the value for tl_school_amusement.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
