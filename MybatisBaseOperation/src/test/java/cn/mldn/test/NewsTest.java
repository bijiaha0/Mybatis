package cn.mldn.test;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;
import junit.framework.TestCase;
public class NewsTest {
	private Logger log = Logger.getLogger(NewsTest.class);
	@Test
	public void testAdd() throws Exception {
		Random rand = new Random();
		News vo = new News();
		vo.setTitle("mldn-bijiahao3  - " + rand.nextInt(1121));
		vo.setPubdate(new Date());
		int len = MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.NewsNS.doCreate", vo);
		MyBatisSessionFactory.getSession().commit();
		TestCase.assertEquals(len, 1);
		log.info(vo); // 直接输出VO对象
		MyBatisSessionFactory.close();
	}
	@Test
	public void testEdit() throws Exception {
		Random rand = new Random();
		News vo = new News();
		vo.setNid(1);
		vo.setTitle("修改数据xxx  - " + rand.nextInt(9129292));
		int len = MyBatisSessionFactory.getSession().update("cn.mldn.vo.mapping.NewsNS.doUpdate", vo);
		MyBatisSessionFactory.getSession().commit();
		TestCase.assertEquals(len, 1);
		MyBatisSessionFactory.close();
	}
	@Test
	public void testRemove() throws Exception {
		int len = MyBatisSessionFactory.getSession().delete("cn.mldn.vo.mapping.NewsNS.doRemove", 1);
		MyBatisSessionFactory.getSession().commit();
		TestCase.assertEquals(len, 1);
		MyBatisSessionFactory.close();
	}
	@Test
	public void testGet() throws Exception {
		 News vo = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.NewsNS.findById3", 2);
		 log.info(vo);
		 TestCase.assertNotNull(vo);
		 MyBatisSessionFactory.close();
	}
	@Test
	public void testList() throws Exception {
		List<News> all = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.NewsNS.findAll");
		log.info(all);
		TestCase.assertTrue(all.size() > 0);
		MyBatisSessionFactory.close();
	}
	@Test
	public void testSplit() throws Exception {
		int currentPage = 2;
		int lineSize = 5;
		String column = "title";
		String keyWord = "mldn";
		// 在整个映射文件里面接收的数据类型为Map集合
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("column", column);
		map.put("keyWord", "%"+keyWord+"%");
		map.put("lineSize", lineSize);
		map.put("start", (currentPage - 1) * lineSize);
		List<News> allNews = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.NewsNS.findAllSplit",
				map);
		Integer newsCount = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.NewsNS.getAllCount", map);
		System.out.println(allNews);
		System.out.println(newsCount);
		MyBatisSessionFactory.close();
	}
}
