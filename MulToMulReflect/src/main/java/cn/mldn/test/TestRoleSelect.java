package cn.mldn.test;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Role; 

public class TestRoleSelect {
	public static void main(String[] args) {
		Role role = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.RoleNS.findById", 2);
		System.out.println(role); 
	}
}
