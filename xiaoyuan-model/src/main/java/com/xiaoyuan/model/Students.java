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
@TableName("tl_school_students")
@Repository
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("student_ID")
    private Integer studentId;

    private Integer classId;

    private String studentname;

    private String grade;

    private String classname;

    private String schoolname;

    private Integer studentMobliephone;

    private String parentName;

    private Integer parentMobliephone;

    private Integer studentTelephone;

    private String status;

    private Date createTime;

    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.student_ID
     *
     * @param studentId the value for tl_school_students.student_ID
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.class_id
     *
     * @return the value of tl_school_students.class_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.class_id
     *
     * @param classId the value for tl_school_students.class_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.studentname
     *
     * @return the value of tl_school_students.studentname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.studentname
     *
     * @param studentname the value for tl_school_students.studentname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.grade
     *
     * @return the value of tl_school_students.grade
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.grade
     *
     * @param grade the value for tl_school_students.grade
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.classname
     *
     * @return the value of tl_school_students.classname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getClassname() {
        return classname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.classname
     *
     * @param classname the value for tl_school_students.classname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.schoolname
     *
     * @return the value of tl_school_students.schoolname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getSchoolname() {
        return schoolname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.schoolname
     *
     * @param schoolname the value for tl_school_students.schoolname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname == null ? null : schoolname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.student_mobliephone
     *
     * @return the value of tl_school_students.student_mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getStudentMobliephone() {
        return studentMobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.student_mobliephone
     *
     * @param studentMobliephone the value for tl_school_students.student_mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStudentMobliephone(Integer studentMobliephone) {
        this.studentMobliephone = studentMobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.gurdian
     *
     * @return the value of tl_school_students.gurdian
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.gurdian
     *
     * @param parentName the value for tl_school_students.gurdian
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setParentName(String parentName) {
        this.parentName = parentName == null ? null : parentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.gurdian_mobliephone
     *
     * @return the value of tl_school_students.gurdian_mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getParentMobliephone() {
        return parentMobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.gurdian_mobliephone
     *
     * @param parentMobliephone the value for tl_school_students.gurdian_mobliephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setParentMobliephone(Integer parentMobliephone) {
        this.parentMobliephone = parentMobliephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.student_telephone
     *
     * @return the value of tl_school_students.student_telephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getStudentTelephone() {
        return studentTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.student_telephone
     *
     * @param studentTelephone the value for tl_school_students.student_telephone
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStudentTelephone(Integer studentTelephone) {
        this.studentTelephone = studentTelephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.status
     *
     * @return the value of tl_school_students.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.status
     *
     * @param status the value for tl_school_students.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_students.create_time
     *
     * @return the value of tl_school_students.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_students.create_time
     *
     * @param createTime the value for tl_school_students.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
