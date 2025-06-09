package com.entity.view;

import com.entity.ShangpinjiandingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品鉴定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-04 15:16:56
 */
@TableName("shangpinjianding")
public class ShangpinjiandingView  extends ShangpinjiandingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinjiandingView(){
	}
 
 	public ShangpinjiandingView(ShangpinjiandingEntity shangpinjiandingEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinjiandingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
