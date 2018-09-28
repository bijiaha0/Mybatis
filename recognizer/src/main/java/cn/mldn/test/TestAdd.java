package cn.mldn.test;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Student;
import cn.mldn.vo.Worker;

public class TestAdd {
	public static void main(String[] args) {
		Student stu = new Student() ;
		stu.setMid("stu - 1");
		stu.setName("小学生");
		stu.setAge(10);
		stu.setSchool("家里蹲小学");
		stu.setScore(100.0);
		System.out.println(MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.MemberNS.doCreateStudent", stu));
		MyBatisSessionFactory.getSession().commit();
		Worker wkr = new Worker() ;
		wkr.setMid("wkr - 1");
		wkr.setName("小李");
		wkr.setAge(18);
		wkr.setCompany("MLDN");
		wkr.setSalary(1.1);
		System.out.println(MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.MemberNS.doCreateWorker", wkr));
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
