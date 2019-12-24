package com.xiaoyuan.service;

import com.xiaoyuan.model.Band;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface IBandService extends IService<Band> {

    /**
     * 查询手环信息
     * @return
     */
    List<Band> selectBand();

    /**
     * 新增手环
     * @param record
     * @return
     */
    int addBand(Band record);

    /**
     * 修改手环
     * @param bandId
     * @return
     */
    int updateBand(Integer bandId);

    /**
     * 删除手环
     * @param bandId
     * @return
     */
    int deleteBand(Integer bandId);

    /**
     * 修改手环状态
     * @param Status
     * @return
     */
    int updateBandStatus(String Status);

}
