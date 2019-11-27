package com.xiaoyuan.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
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
@TableName("tl_school_teachers")
@Repository
public class Teachers implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("teacher_ID")
    private Integer teacherId;

    @TableField("class_id")
    private Integer classID;

    private String teachername;

    private String schoolname;


    private String post;

    private Integer teachermobilephone;

    private Integer teacherTelephone;

    private String teacherAddress;

    private Integer status;

    private LocalDateTime createTime;


}
