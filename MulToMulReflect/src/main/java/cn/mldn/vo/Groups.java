package cn.mldn.vo;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Groups implements Serializable {
	private Integer gid ;
	private String title ;
	private List<Role> allRoles ;
	public Integer getGid() {
		return gid;
	}
	public void setGid(Integer gid) {
		this.gid = gid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Role> getAllRoles() {
		return allRoles;
	}
	public void setAllRoles(List<Role> allRoles) {
		this.allRoles = allRoles;
	}
	@Override
	public String toString() {
		return "Groups [gid=" + gid + ", title=" + title + "]";
	}
}
