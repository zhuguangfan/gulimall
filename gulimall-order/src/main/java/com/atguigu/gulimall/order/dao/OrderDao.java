package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ????
 * 
 * @author maidou
 * @email maidou@gmail.com
 * @date 2022-06-22 22:02:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
