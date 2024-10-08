package com.entity.view;

import com.entity.DangjianxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 党建学习
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
@TableName("dangjianxuexi")
public class DangjianxuexiView  extends DangjianxuexiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DangjianxuexiView(){
	}
 
 	public DangjianxuexiView(DangjianxuexiEntity dangjianxuexiEntity){
 	try {
			BeanUtils.copyProperties(this, dangjianxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
