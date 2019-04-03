package cn.com.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.com.dubbo.service.TbItemCatDubboService;
import cn.com.mapper.TbItemCatMapper;
import cn.com.po.TbItemCat;
import cn.com.po.TbItemCatExample;

public class TbItemCatDubboServiceImpl implements TbItemCatDubboService{

	@Resource
	private TbItemCatMapper tbItemCatMapper; 
	
	@Override
	public List<TbItemCat> show(long parendId) {
		TbItemCatExample tbItemCatExample=new TbItemCatExample();
		tbItemCatExample.createCriteria().andParentIdEqualTo(parendId);
		return tbItemCatMapper.selectByExample(tbItemCatExample);
	}
	
	
	

}
