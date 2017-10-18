package cn.hetaoo.doong.web.sys.service.impl;

import cn.hetaoo.doong.web.sys.dao.SysMenuDao;
import cn.hetaoo.doong.web.sys.entity.SysMenuEntity;
import cn.hetaoo.doong.web.sys.entity.SysMenuQueryEntity;
import cn.hetaoo.doong.web.sys.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	@Autowired
	private SysMenuDao sysMenuDao;
	
	@Override
	public SysMenuEntity queryObject(Long menuId){
		return sysMenuDao.selectObjectById(menuId);
	}
	
	@Override
	public List<SysMenuEntity> queryList(SysMenuQueryEntity queryEntity){
		return sysMenuDao.selectList(queryEntity);
	}
	
	@Override
	public Integer queryTotal(SysMenuQueryEntity queryEntity){
		return sysMenuDao.selectTotal(queryEntity);
	}
	
	@Override
	public Integer save(SysMenuEntity sysMenu){
		return sysMenuDao.insert(sysMenu);
	}
	
	@Override
	public Integer update(SysMenuEntity sysMenu){
		return sysMenuDao.update(sysMenu);
	}
	
	@Override
	public Integer deleteById(Long menuId){
		return sysMenuDao.deleteById(menuId);
	}
	
	@Override
	public Integer deleteBatch(List<Long> menuIds){
		return sysMenuDao.deleteBatchByIds(menuIds.toArray());
	}
	
}
