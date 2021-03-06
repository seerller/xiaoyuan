package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("tl_school_homework_return")
@Repository
public class HomeworkReturn implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer homeworkReturnId;

    private Integer homeworkId;

    private String subject;

    private String studentname;

    private String gurdian;

    private String files;

    private String content;

    private String status;

    private Date createTime;

    public Integer getHomeworkReturnId() {
        return homeworkReturnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.homework_return_id
     *
     * @param homeworkReturnId the value for tl_school_homework_return.homework_return_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setHomeworkReturnId(Integer homeworkReturnId) {
        this.homeworkReturnId = homeworkReturnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.homework_id
     *
     * @return the value of tl_school_homework_return.homework_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Integer getHomeworkId() {
        return homeworkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.homework_id
     *
     * @param homeworkId the value for tl_school_homework_return.homework_id
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setHomeworkId(Integer homeworkId) {
        this.homeworkId = homeworkId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.subject
     *
     * @return the value of tl_school_homework_return.subject
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.subject
     *
     * @param subject the value for tl_school_homework_return.subject
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.studentname
     *
     * @return the value of tl_school_homework_return.studentname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStudentname() {
        return studentname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.studentname
     *
     * @param studentname the value for tl_school_homework_return.studentname
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.gurdian
     *
     * @return the value of tl_school_homework_return.gurdian
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getGurdian() {
        return gurdian;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.gurdian
     *
     * @param gurdian the value for tl_school_homework_return.gurdian
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setGurdian(String gurdian) {
        this.gurdian = gurdian == null ? null : gurdian.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.files
     *
     * @return the value of tl_school_homework_return.files
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getFiles() {
        return files;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.files
     *
     * @param files the value for tl_school_homework_return.files
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setFiles(String files) {
        this.files = files == null ? null : files.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.content
     *
     * @return the value of tl_school_homework_return.content
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.content
     *
     * @param content the value for tl_school_homework_return.content
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.status
     *
     * @return the value of tl_school_homework_return.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.status
     *
     * @param status the value for tl_school_homework_return.status
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tl_school_homework_return.create_time
     *
     * @return the value of tl_school_homework_return.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tl_school_homework_return.create_time
     *
     * @param createTime the value for tl_school_homework_return.create_time
     *
     * @mbggenerated Mon Nov 25 17:21:19 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
