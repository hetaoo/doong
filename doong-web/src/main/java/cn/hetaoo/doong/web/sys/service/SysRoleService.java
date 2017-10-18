package cn.hetaoo.doong.web.sys.service;

import cn.hetaoo.doong.web.sys.entity.SysRoleEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleQueryEntity;

import java.util.List;

/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
public interface SysRoleService {
	
	SysRoleEntity queryObject(Long roleId);
	
	List<SysRoleEntity> queryList(SysRoleQueryEntity queryEntity);

    Integer queryTotal(SysRoleQueryEntity queryEntity);
	
	Integer save(SysRoleEntity sysRole);

    Integer update(SysRoleEntity sysRole);

    Integer deleteById(Long roleId);

    Integer deleteBatch(List<Long> roleIds);
}
