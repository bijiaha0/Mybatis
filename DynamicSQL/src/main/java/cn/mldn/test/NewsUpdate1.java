package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;

public class NewsUpdate1 {
	public static void main(String[] args) throws Exception {
		News vo = new News();
		vo.setNid(10);
		vo.setTitle("世界混乱了。");
		// vo.setPubdate(new SimpleDateFormat("yyyy-MM-dd").parse("1911-11-11"));
		System.out.println(MyBatisSessionFactory.getSession().update("cn.mldn.vo.mapping.NewsNS.doUpdate", vo));
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
