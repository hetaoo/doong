package cn.hetaoo.doong.web.sys.service;

import cn.hetaoo.doong.web.sys.entity.SysMenuEntity;
import cn.hetaoo.doong.web.sys.entity.SysMenuQueryEntity;

import java.util.List;

/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
public interface SysMenuService {
	
	SysMenuEntity queryObject(Long menuId);
	
	List<SysMenuEntity> queryList(SysMenuQueryEntity queryEntity);

    Integer queryTotal(SysMenuQueryEntity queryEntity);
	
	Integer save(SysMenuEntity sysMenu);

    Integer update(SysMenuEntity sysMenu);

    Integer deleteById(Long menuId);

    Integer deleteBatch(List<Long> menuIds);
}
