package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author sunjunyao
 * @email sjy@gmail.com
 * @date 2021-05-25 14:44:08
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
