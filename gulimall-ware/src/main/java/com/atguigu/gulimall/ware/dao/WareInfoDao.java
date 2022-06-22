package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author maidou
 * @email maidou@gmail.com
 * @date 2022-06-22 22:04:46
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
