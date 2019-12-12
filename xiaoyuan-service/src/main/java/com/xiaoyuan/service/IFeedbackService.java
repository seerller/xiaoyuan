package com.xiaoyuan.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyuan.model.Feedback;

import java.util.List;

public interface IFeedbackService extends IService<Feedback> {
    /**
     * 查询反馈信息
     * @return
     */
    List<Feedback> selectFeedback();

    /**
     * 添加反馈信息
     * @param record
     * @return
     */
    int insertReply(Feedback record);

    /**
     * 修改反馈状态
     * @param Status
     * @return
     */
    int updateStatus(String Status);

    /**
     * 删除反馈信息
     * @param feedbackId
     * @return
     */
    int deleteFeedback(Integer feedbackId);
}
