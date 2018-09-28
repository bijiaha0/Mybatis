package cn.mldn.test;

import java.util.Date;

import cn.mldn.dao.INewsDAO;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;

public class TestNewsInsert {
	public static void main(String[] args) throws Exception {
		// 取得了一个动态的DAO接口实例化对象
		INewsDAO newsDAO = MyBatisSessionFactory.getSession().getMapper(INewsDAO.class);
		News vo = new News() ;
		vo.setTitle("Annotation自动配置");
		vo.setPubdate(new Date());
		System.out.println(newsDAO.doCreate(vo));
		MyBatisSessionFactory.getSession().commit(); 
	}
}
