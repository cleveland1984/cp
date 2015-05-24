package cn.myq.denglu.vo;

import java.io.Serializable;
import java.util.List;

public class Privilege implements Serializable {
	private Integer pid;
	private String title;
	private String note;
	private List<Role> roles;
	private List<PrivilegeDetails> privilegeDetails;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
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
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public List<PrivilegeDetails> getPrivilegeDetails() {
		return privilegeDetails;
	}
	public void setPrivilegeDetails(List<PrivilegeDetails> privilegeDetails) {
		this.privilegeDetails = privilegeDetails;
	}
	@Override
	public String toString() {
		return "Privilege [pid=" + pid + ", title=" + title + ", note=" + note
				+ ", roles=" + roles + ", privilegeDetails=" + privilegeDetails
				+ "]";
	}
	
	
}
