package com.xiaoyuan.controller;

import com.xiaoyuan.controller.common.BaseController;
import com.xiaoyuan.model.Feedback;
import com.xiaoyuan.service.impl.FeedbackServiceImpl;
import com.xiaoyuan.tools.MessageBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/mapper/feedback")
@Api(value = "/feedback", description = "意见反馈控制层")
public class FeedbackController extends BaseController {
    @Autowired
    FeedbackServiceImpl feedbackService;

    @RequestMapping(value = "/selectFeedback", method = RequestMethod.GET)
    @ApiOperation(value = "查询反馈信息", notes = "")
    public MessageBean selectFeedback(){
        return resultSuccess(selectFeedback());
    }

    @RequestMapping(value = "/insertReply",method = RequestMethod.POST)
    @ApiOperation(value = "回复反馈", notes = "")
    public MessageBean insertReply(Feedback record){
        return resultSuccess(insertReply(record));
    }

    @RequestMapping(value = "updateStatus", method = RequestMethod.GET)
    @ApiOperation(value = "更改反馈信息状态", notes = "根据是否回复消息更改反馈信息状态")
    public MessageBean updateStatus(@RequestParam(value = "回复") String Status){
        return resultSuccess(feedbackService.updateStatus(Status="已解答"));
    }

    @RequestMapping(value = "/deleteFeedback", method = RequestMethod.POST)
    @ApiOperation(value = "删除反馈信息", notes = "根究主键删除反馈信息")
    public MessageBean deleteFeedback(Integer feedbackId){
        return resultSuccess(deleteFeedback(feedbackId));
    }
}
