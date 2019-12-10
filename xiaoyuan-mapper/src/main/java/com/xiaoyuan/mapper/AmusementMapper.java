package com.xiaoyuan.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaoyuan.model.Amusement;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AmusementMapper extends BaseMapper<AmusementMapper> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_amusement
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int deleteByPrimaryKey(Integer amusemenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_amusement
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int insert(Amusement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_amusement
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    Amusement selectByPrimaryKey(Integer amusemenId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_amusement
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    List<Amusement> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tl_school_amusement
     *
     * @mbggenerated Mon Nov 25 17:09:46 CST 2019
     */
    int updateByPrimaryKey(Amusement record);

    /**
     * 查询娱乐信息
     * @return
     */
    List<Amusement> selectAmusment();

    /**
     * 新增娱乐信息
     * @param record
     * @return
     */
    int addAmusement(Amusement record);

    /**
     * 修改娱乐信息
     * @param amusementId
     * @return
     */
    int updateAmusement(Integer amusementId);

    /**
     * 删除娱乐信息
     * @param amusementId
     * @return
     */
    int deleteAmusementById(Integer amusementId);
}
