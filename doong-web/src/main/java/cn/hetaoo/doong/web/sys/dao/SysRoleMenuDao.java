package cn.hetaoo.doong.web.sys.dao;

import cn.hetaoo.doong.common.dao.BaseDao;
import cn.hetaoo.doong.web.sys.entity.SysRoleMenuEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleMenuQueryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
@Mapper
public interface SysRoleMenuDao extends BaseDao<SysRoleMenuEntity, SysRoleMenuQueryEntity> {
	
}
