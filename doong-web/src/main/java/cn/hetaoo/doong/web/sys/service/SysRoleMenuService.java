package cn.hetaoo.doong.web.sys.service;

import cn.hetaoo.doong.web.sys.entity.SysRoleMenuEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleMenuQueryEntity;

import java.util.List;

/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
public interface SysRoleMenuService {
	
	SysRoleMenuEntity queryObject(Long id);
	
	List<SysRoleMenuEntity> queryList(SysRoleMenuQueryEntity queryEntity);

    Integer queryTotal(SysRoleMenuQueryEntity queryEntity);
	
	Integer save(SysRoleMenuEntity sysRoleMenu);

    Integer update(SysRoleMenuEntity sysRoleMenu);

    Integer deleteById(Long id);

    Integer deleteBatch(List<Long> ids);
}
