package cn.mldn.test;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.MemberDetails;
import cn.mldn.vo.MemberLogin;

public class TestMemberAdd {
	public static void main(String[] args) {
		MemberLogin login = new MemberLogin();
		MemberDetails details = new MemberDetails();
		login.setMid("hello");
		login.setPassword("www.mldnjava.cn");
		details.setMid("hello");
		details.setName("小李");
		details.setAge(10);
		System.out
				.println(MyBatisSessionFactory.getSession().
						insert("cn.mldn.vo.mapping.MemberLoginNS.doCreate", login));
		System.out.println(
				MyBatisSessionFactory.getSession().
				insert("cn.mldn.vo.mapping.MemberDetailsNS.doCreate", details));
		MyBatisSessionFactory.getSession().commit(); 
	}
}
