package cn.mldn.test;

import java.util.List;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Student;

public class TestSelectStudent {
	public static void main(String[] args) {
		List<Student> all = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.MemberNS.findAllStudent");
		System.out.println(all);
	}
}
