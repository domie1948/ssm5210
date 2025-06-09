package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinjiandingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinjiandingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinjiandingView;


/**
 * 商品鉴定
 *
 * @author 
 * @email 
 * @date 2021-03-04 15:16:56
 */
public interface ShangpinjiandingService extends IService<ShangpinjiandingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinjiandingVO> selectListVO(Wrapper<ShangpinjiandingEntity> wrapper);
   	
   	ShangpinjiandingVO selectVO(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
   	
   	List<ShangpinjiandingView> selectListView(Wrapper<ShangpinjiandingEntity> wrapper);
   	
   	ShangpinjiandingView selectView(@Param("ew") Wrapper<ShangpinjiandingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinjiandingEntity> wrapper);
   	
}

