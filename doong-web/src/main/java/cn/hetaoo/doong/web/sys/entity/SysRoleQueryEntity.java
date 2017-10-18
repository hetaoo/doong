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
public class SysRoleQueryEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//角色id
	private Long roleId;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//角色名称
	private String roleName;
	//角色描述
	private String roleDesc;
	//父级角色id
	private Integer parentId;
	//创建者id
	private Integer createUserId;
	//修改者id
	private Integer modifiedUserId;
	//数据备注
	private String dbRemark;


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
	 * set：角色名称
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}
	/**
	 * get：角色名称
	 */
	public String getRoleName() {
		return roleName;
	}
	/**
	 * set：角色描述
	 */
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc == null ? null : roleDesc.trim();
	}
	/**
	 * get：角色描述
	 */
	public String getRoleDesc() {
		return roleDesc;
	}
	/**
	 * set：父级角色id
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * get：父级角色id
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * set：创建者id
	 */
	public void setCreateUserId(Integer createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * get：创建者id
	 */
	public Integer getCreateUserId() {
		return createUserId;
	}
	/**
	 * set：修改者id
	 */
	public void setModifiedUserId(Integer modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}
	/**
	 * get：修改者id
	 */
	public Integer getModifiedUserId() {
		return modifiedUserId;
	}
	/**
	 * set：数据备注
	 */
	public void setDbRemark(String dbRemark) {
		this.dbRemark = dbRemark == null ? null : dbRemark.trim();
	}
	/**
	 * get：数据备注
	 */
	public String getDbRemark() {
		return dbRemark;
	}
}
