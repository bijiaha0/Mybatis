package cn.mldn.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Worker extends Member implements Serializable {
	private String company ;
	private Double salary ;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return super.toString() + "Worker [company=" + company + ", salary=" + salary + "]";
	}
	
}
