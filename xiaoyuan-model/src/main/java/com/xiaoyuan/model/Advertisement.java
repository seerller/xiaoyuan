package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("tl_school_advertisement")
@Repository
public class Advertisement implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer advertisementId;

    @TableField("school_ID")
    private Integer schoolId;

    private String title;

    private String subtitle;

    private String content;

    private String target;

    private Date startTime;

    private Date endTime;

    private String status;

    private Date createTime;

    public Integer getAdvertisementId() {
        return advertisementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.advertisement_id
     *
     * @param advertisementId the value for tl_school_advertisement.advertisement_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setAdvertisementId(Integer advertisementId) {
        this.advertisementId = advertisementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.school_ID
     *
     * @return the value of tl_school_advertisement.school_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getSchoolId() {
        return schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.school_ID
     *
     * @param schoolId the value for tl_school_advertisement.school_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.title
     *
     * @return the value of tl_school_advertisement.title
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.title
     *
     * @param title the value for tl_school_advertisement.title
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.subtitle
     *
     * @return the value of tl_school_advertisement.subtitle
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.subtitle
     *
     * @param subtitle the value for tl_school_advertisement.subtitle
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.content
     *
     * @return the value of tl_school_advertisement.content
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.content
     *
     * @param content the value for tl_school_advertisement.content
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.target
     *
     * @return the value of tl_school_advertisement.target
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.target
     *
     * @param target the value for tl_school_advertisement.target
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.start_time
     *
     * @return the value of tl_school_advertisement.start_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.start_time
     *
     * @param startTime the value for tl_school_advertisement.start_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.end_time
     *
     * @return the value of tl_school_advertisement.end_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.end_time
     *
     * @param endTime the value for tl_school_advertisement.end_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.status
     *
     * @return the value of tl_school_advertisement.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.status
     *
     * @param status the value for tl_school_advertisement.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_advertisement.create_time
     *
     * @return the value of tl_school_advertisement.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_advertisement.create_time
     *
     * @param createTime the value for tl_school_advertisement.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
