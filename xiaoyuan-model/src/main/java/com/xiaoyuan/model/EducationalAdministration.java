package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("tl_school_educational_administration")
@Repository
public class EducationalAdministration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("cource_ID")
    private Integer courceId;

    private Integer classId;

    private String cource;

    private String teachername;

    private String classname;

    private Date startTime;

    private Date endTime;

    private Integer schoolID;

    private String schoolname;

    private Date createTime;

    public Integer getCourceId() {
        return courceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.cource_ID
     *
     * @param courceId the value for tl_school_educational_administration.cource_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCourceId(Integer courceId) {
        this.courceId = courceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.class_id
     *
     * @return the value of tl_school_educational_administration.class_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.class_id
     *
     * @param classId the value for tl_school_educational_administration.class_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.cource
     *
     * @return the value of tl_school_educational_administration.cource
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getCource() {
        return cource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.cource
     *
     * @param cource the value for tl_school_educational_administration.cource
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCource(String cource) {
        this.cource = cource == null ? null : cource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.teachername
     *
     * @return the value of tl_school_educational_administration.teachername
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getTeachername() {
        return teachername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.teachername
     *
     * @param teachername the value for tl_school_educational_administration.teachername
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.classname
     *
     * @return the value of tl_school_educational_administration.classname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getClassname() {
        return classname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.classname
     *
     * @param classname the value for tl_school_educational_administration.classname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.start_time
     *
     * @return the value of tl_school_educational_administration.start_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.start_time
     *
     * @param startTime the value for tl_school_educational_administration.start_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.end_time
     *
     * @return the value of tl_school_educational_administration.end_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.end_time
     *
     * @param endTime the value for tl_school_educational_administration.end_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.schoolname
     *
     * @return the value of tl_school_educational_administration.schoolname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.schoolname
     *
     * @param schoolname the value for tl_school_educational_administration.schoolname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_educational_administration.create_time
     *
     * @return the value of tl_school_educational_administration.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_educational_administration.create_time
     *
     * @param createTime the value for tl_school_educational_administration.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
