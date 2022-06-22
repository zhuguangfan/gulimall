package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ???Է??
 * 
 * @author maidou
 * @email maidou@gmail.com
 * @date 2022-06-22 19:49:35
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * ????
	 */
	private String attrGroupName;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ????
	 */
	private String descript;
	/**
	 * ??ͼ?
	 */
	private String icon;
	/**
	 * ????????id
	 */
	private Long catelogId;

}
