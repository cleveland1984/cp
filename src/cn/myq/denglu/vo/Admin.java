package cn.myq.denglu.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Admin implements Serializable {
	private String adid;
	private Role role = new Role();
	private String password;
	private Date lastlogin;
	private Integer flag;
	private List<AdminLogin> adminlogins;
	public String getAdid() {
		return adid;
	}
	public void setAdid(String adid) {
		this.adid = adid;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLastlogin() {
		return lastlogin;
	}
	public void setLastlogin(Date lastlogin) {
		this.lastlogin = lastlogin;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public List<AdminLogin> getAdminlogins() {
		return adminlogins;
	}
	public void setAdminlogins(List<AdminLogin> adminlogins) {
		this.adminlogins = adminlogins;
	}
	@Override
	public String toString() {
		return "Admin [adid=" + adid + ", role=" + role + ", password="
				+ password + ", lastlogin=" + lastlogin + ", flag=" + flag
				+ ", adminlogins=" + adminlogins + "]";
	}
	
	
}
