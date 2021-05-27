package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author sunjunyao
 * @email sjy@gmail.com
 * @date 2021-05-27 11:09:52
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
