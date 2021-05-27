package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author sunjunyao
 * @email sjy@gmail.com
 * @date 2021-05-27 11:05:09
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
