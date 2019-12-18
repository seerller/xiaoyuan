package com.xiaoyuan.service;

import com.xiaoyuan.model.Attence;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IAttenceService {
    /**
     * 查询班级
     * @return
     */
    List<Attence> selectClassName(Integer schoolID);

    /**
     * 查询学生
     * @return
     */
    List<Attence> selectStudentname(Integer classId);

    /**
     * 查询详情
     * @return
     */
    List<Attence> selectAttence(Integer studentID);

    /**
     * 考勤统计
     * @param studentID
     * @return
     */
    List<Attence> selectAttenceCount(Integer studentID);
}
