package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author sunjunyao
 * @email sjy@gmail.com
 * @date 2021-05-27 11:15:01
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
