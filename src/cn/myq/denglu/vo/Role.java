package cn.myq.denglu.vo;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
	private Integer rid;
	private String title;
	private String note;
	private List<Privilege> privileges;
	private List<Admin> admins;
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}
	public List<Admin> getAdmins() {
		return admins;
	}
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", title=" + title + ", note=" + note
				+ ", privileges=" + privileges + ", admins=" + admins + "]";
	}
	
	
}
