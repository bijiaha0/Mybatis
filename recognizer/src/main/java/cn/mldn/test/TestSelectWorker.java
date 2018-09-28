package cn.mldn.test;

import java.util.List;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Worker;

public class TestSelectWorker {
	public static void main(String[] args) {
		List<Worker> all = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.MemberNS.findAllWorker");
		System.out.println(all);
	}
}
