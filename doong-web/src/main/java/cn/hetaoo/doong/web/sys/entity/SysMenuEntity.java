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
public class SysMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//菜单id
	private Long menuId;
	//创建时间
	private Date gmtCreate;
	//修改时间
	private Date gmtModified;
	//父级菜单id
	private Long parentId;
	//菜单名称
	private String menuName;
	//url
	private String url;
	//允许权限
	private String perms;
	//菜单类型
	private Integer menuType;
	//图标
	private String icon;
	//排序序号
	private Integer orderNum;
	//数据备注
	private String dbRemark;

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
	 * set：父级菜单id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * get：父级菜单id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * set：菜单名称
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	/**
	 * get：菜单名称
	 */
	public String getMenuName() {
		return menuName;
	}
	/**
	 * set：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * get：url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * set：允许权限
	 */
	public void setPerms(String perms) {
		this.perms = perms;
	}
	/**
	 * get：允许权限
	 */
	public String getPerms() {
		return perms;
	}
	/**
	 * set：菜单类型
	 */
	public void setMenuType(Integer menuType) {
		this.menuType = menuType;
	}
	/**
	 * get：菜单类型
	 */
	public Integer getMenuType() {
		return menuType;
	}
	/**
	 * set：图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * get：图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * set：排序序号
	 */
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * get：排序序号
	 */
	public Integer getOrderNum() {
		return orderNum;
	}
	/**
	 * set：数据备注
	 */
	public void setDbRemark(String dbRemark) {
		this.dbRemark = dbRemark;
	}
	/**
	 * get：数据备注
	 */
	public String getDbRemark() {
		return dbRemark;
	}
}
