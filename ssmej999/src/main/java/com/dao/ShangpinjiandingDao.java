package com.dao;

import com.entity.ShangpinjiandingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinjiandingVO;
import com.entity.view.ShangpinjiandingView;


/**
 * 商品鉴定
 * 
 * @author 
 * @email 
 * @date 2021-03-04 15:16:56
 */
public interface ShangpinjiandingDao extends BaseMapper<ShangpinjiandingEntity> {
	
	List<ShangpinjiandingVO> selectListVO(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
	
	ShangpinjiandingVO selectVO(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
	
	List<ShangpinjiandingView> selectListView(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);

	List<ShangpinjiandingView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
	
	ShangpinjiandingView selectView(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
	
}
