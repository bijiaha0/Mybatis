package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student extends Member implements Serializable {
	private String school ;
	private Double score ;
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return super.toString() + "Student [school=" + school + ", score=" + score + "]";
	}
	
}
