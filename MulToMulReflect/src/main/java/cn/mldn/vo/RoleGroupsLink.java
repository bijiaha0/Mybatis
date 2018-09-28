package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RoleGroupsLink implements Serializable {
	private Role role ; 
	private Groups groups ;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Groups getGroups() {
		return groups;
	}
	public void setGroups(Groups groups) {
		this.groups = groups;
	}
}
