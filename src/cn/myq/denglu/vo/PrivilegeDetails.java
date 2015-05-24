package cn.myq.denglu.vo;

import java.io.Serializable;

public class PrivilegeDetails implements Serializable {
	private Integer pdid;
	private Privilege privilege = new Privilege();
	private String title;
	private String note;
	public Integer getPdid() {
		return pdid;
	}
	public void setPdid(Integer pdid) {
		this.pdid = pdid;
	}
	public Privilege getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
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
	@Override
	public String toString() {
		return "PrivilegeDetails [pdid=" + pdid + ", privilege=" + privilege
				+ ", title=" + title + ", note=" + note + "]";
	}
	
	
}
