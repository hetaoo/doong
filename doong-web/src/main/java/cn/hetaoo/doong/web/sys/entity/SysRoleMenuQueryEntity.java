package cn.hetaoo.doong.web.sys.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author hetaoo
 * @email i@hetaoo.cn
 * @date 2017-10-18 16:17:27
 */
public class SysRoleMenuQueryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键id
	private Long id;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//角色id
	private Long roleId;
	//菜单id
	private Long menuId;


	/**
	 * set：主键id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * get：主键id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * set：创建时间
	 */
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	/**
	 * get：创建时间
	 */
	public Date getGmtCreate() {
		return gmtCreate;
	}
	/**
	 * set：修改时间
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * get：修改时间
	 */
	public Date getGmtModified() {
		return gmtModified;
	}
	/**
	 * set：角色id
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	/**
	 * get：角色id
	 */
	public Long getRoleId() {
		return roleId;
	}
	/**
	 * set：菜单id
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	/**
	 * get：菜单id
	 */
	public Long getMenuId() {
		return menuId;
	}
}
