package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Subtype implements Serializable {
	private Integer stid ;
	private String title ;
	private Type type ;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Subtype [stid=" + stid + ", title=" + title + ", type=" + type + "]";
	}
}
