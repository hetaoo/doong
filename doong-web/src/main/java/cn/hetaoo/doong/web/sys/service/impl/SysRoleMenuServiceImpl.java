package cn.hetaoo.doong.web.sys.service.impl;

import cn.hetaoo.doong.web.sys.dao.SysRoleMenuDao;
import cn.hetaoo.doong.web.sys.entity.SysRoleMenuEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleMenuQueryEntity;
import cn.hetaoo.doong.web.sys.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
	@Autowired
	private SysRoleMenuDao sysRoleMenuDao;
	
	@Override
	public SysRoleMenuEntity queryObject(Long id){
		return sysRoleMenuDao.selectObjectById(id);
	}
	
	@Override
	public List<SysRoleMenuEntity> queryList(SysRoleMenuQueryEntity queryEntity){
		return sysRoleMenuDao.selectList(queryEntity);
	}
	
	@Override
	public Integer queryTotal(SysRoleMenuQueryEntity queryEntity){
		return sysRoleMenuDao.selectTotal(queryEntity);
	}
	
	@Override
	public Integer save(SysRoleMenuEntity sysRoleMenu){
		return sysRoleMenuDao.insert(sysRoleMenu);
	}
	
	@Override
	public Integer update(SysRoleMenuEntity sysRoleMenu){
		return sysRoleMenuDao.update(sysRoleMenu);
	}
	
	@Override
	public Integer deleteById(Long id){
		return sysRoleMenuDao.deleteById(id);
	}
	
	@Override
	public Integer deleteBatch(List<Long> ids){
		return sysRoleMenuDao.deleteBatchByIds(ids.toArray());
	}
	
}
