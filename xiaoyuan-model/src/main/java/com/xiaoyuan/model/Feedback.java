package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.sql.Blob;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Repository;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tl_school_feedback")
@Repository
public class Feedback implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer feedbackId;

    @TableField("school_ID")
    private Integer schoolID;

    private String schoolname;

    private Integer classId;

    private String classname;

    private String feedbackperson;

    private String content;

    private String Status;

    private String reply;

    private Date createTime;
}
