package com.xiaoyuan.service;

import com.xiaoyuan.model.School;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jobob
 * @since 2019-11-26
 */
public interface ISchoolService extends IService<School> {
    List<School> selectAll();
    School selectByPrimaryKey(@Param("schoolId") Integer schoolId);
    int updateByPrimaryKey(School record);
    int deleteByPrimaryKey(Integer schoolId);
    int insert(School record);

}
