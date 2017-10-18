package cn.hetaoo.doong.web.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import cn.hetaoo.doong.web.sys.dao.SysRoleDao;
import cn.hetaoo.doong.web.sys.entity.SysRoleEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleQueryEntity;
import cn.hetaoo.doong.web.sys.service.SysRoleService;



@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
	@Autowired
	private SysRoleDao sysRoleDao;
	
	@Override
	public SysRoleEntity queryObject(Long roleId){
		return sysRoleDao.selectObjectById(roleId);
	}
	
	@Override
	public List<SysRoleEntity> queryList(SysRoleQueryEntity queryEntity){
		return sysRoleDao.selectList(queryEntity);
	}
	
	@Override
	public Integer queryTotal(SysRoleQueryEntity queryEntity){
		return sysRoleDao.selectTotal(queryEntity);
	}
	
	@Override
	public Integer save(SysRoleEntity sysRole){
		return sysRoleDao.insert(sysRole);
	}
	
	@Override
	public Integer update(SysRoleEntity sysRole){
		return sysRoleDao.update(sysRole);
	}
	
	@Override
	public Integer deleteById(Long roleId){
		return sysRoleDao.deleteById(roleId);
	}
	
	@Override
	public Integer deleteBatch(List<Long> roleIds){
		return sysRoleDao.deleteBatchByIds(roleIds.toArray());
	}
	
}
