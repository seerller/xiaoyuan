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
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Repository;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tl_school_attence")
@Repository
public class Attence implements Serializable{
    private static final long serialVersionUID = 1L;

    private Integer attenceId;

    @TableField("school_ID")
    private Integer schoolID;

    @TableField("class_id")
    private Integer classId;

    private String classname;

    @TableField("stuedent_ID")
    private Integer studentID;

    private String studentname;

    private String status;

    private Integer times;

    private String leave;

    private String review;

    private Date createTime;

}
