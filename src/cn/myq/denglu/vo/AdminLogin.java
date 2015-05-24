package cn.myq.denglu.vo;

import java.io.Serializable;
import java.util.Date;

public class AdminLogin implements Serializable {
	private Integer alid;
	private Admin admin = new Admin();
	private Date logindate;
	private String url;
	public Integer getAlid() {
		return alid;
	}
	public void setAlid(Integer alid) {
		this.alid = alid;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Date getLogindate() {
		return logindate;
	}
	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "AdminLogin [alid=" + alid + ", admin=" + admin + ", logindate="
				+ logindate + ", url=" + url + "]";
	}
	
	
}
