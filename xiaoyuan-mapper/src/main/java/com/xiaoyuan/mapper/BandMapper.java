package com.xiaoyuan.mapper;

import com.xiaoyuan.model.Band;
import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BandMapper extends BaseMapper<BandMapper>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_band
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer bandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_band
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Band record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_band
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Band selectByPrimaryKey(Integer bandId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_band
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Band> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_band
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Band record);

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
