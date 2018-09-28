package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberLogin implements Serializable {
	private String mid ;
	private String password ;
	private MemberDetails details ;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MemberDetails getDetails() {
		return details;
	}
	public void setDetails(MemberDetails details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "MemberLogin [mid=" + mid + ", password=" + password + "]";
	}
}
