package cn.mldn.vo;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Role implements Serializable {
	private Integer rid ;
	private String title ;
	private List<Groups> allGroups ;
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
	public List<Groups> getAllGroups() {
		return allGroups;
	}
	public void setAllGroups(List<Groups> allGroups) {
		this.allGroups = allGroups;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", title=" + title + ", allGroups=" + allGroups + "]";
	}
}
