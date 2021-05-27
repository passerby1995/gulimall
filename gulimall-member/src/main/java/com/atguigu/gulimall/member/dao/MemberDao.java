package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author sunjunyao
 * @email sjy@gmail.com
 * @date 2021-05-26 16:58:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
