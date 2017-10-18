package cn.hetaoo.doong.web.sys.dao;

import cn.hetaoo.doong.common.dao.BaseDao;
import cn.hetaoo.doong.web.sys.entity.SysRoleEntity;
import cn.hetaoo.doong.web.sys.entity.SysRoleQueryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
@Mapper
public interface SysRoleDao extends BaseDao<SysRoleEntity, SysRoleQueryEntity> {
	
}
