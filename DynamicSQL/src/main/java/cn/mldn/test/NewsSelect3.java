package cn.mldn.test;

import java.util.List;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;

public class NewsSelect3 {
	public static void main(String[] args) {
		News vo = new News(); 
		vo.setNid(10);
		//vo.setTitle("世界和平");
		List<News> all = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.NewsNS.findAllByTitle", vo);
		System.out.println(all);
	}
}
