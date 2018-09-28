package cn.mldn.test;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.MemberLogin;

public class TestMemberSelect {
	public static void main(String[] args) {
		MemberLogin login = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.MemberLoginNS.findById",
				"hello");
		System.out.println(login);
		System.out.println(login.getDetails());
	}
}
