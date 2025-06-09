package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangpinjiandingDao;
import com.entity.ShangpinjiandingEntity;
import com.service.ShangpinjiandingService;
import com.entity.vo.ShangpinjiandingVO;
import com.entity.view.ShangpinjiandingView;

@Service("shangpinjiandingService")
public class ShangpinjiandingServiceImpl extends ServiceImpl<ShangpinjiandingDao, ShangpinjiandingEntity> implements ShangpinjiandingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinjiandingEntity> page = this.selectPage(
                new Query<ShangpinjiandingEntity>(params).getPage(),
                new EntityWrapper<ShangpinjiandingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinjiandingEntity> wrapper) {
		  Page<ShangpinjiandingView> page =new Query<ShangpinjiandingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinjiandingVO> selectListVO(Wrapper<ShangpinjiandingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinjiandingVO selectVO(Wrapper<ShangpinjiandingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinjiandingView> selectListView(Wrapper<ShangpinjiandingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinjiandingView selectView(Wrapper<ShangpinjiandingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
