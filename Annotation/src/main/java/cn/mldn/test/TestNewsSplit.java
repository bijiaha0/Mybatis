package cn.mldn.test;

import cn.mldn.dao.INewsDAO;
import cn.mldn.util.MyBatisSessionFactory;

public class TestNewsSplit {
	public static void main(String[] args) throws Exception {
		// 取得了一个动态的DAO接口实例化对象
		INewsDAO newsDAO = MyBatisSessionFactory.getSession().getMapper(INewsDAO.class);
		System.out.println(newsDAO.findAllSplit("title", "%%", 0, 3));
	}
}
