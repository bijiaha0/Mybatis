package cn.mldn.test;
import org.apache.ibatis.session.SqlSession;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;
//一级缓存
public class TestFirstCache {
	public static void main(String[] args) {
		SqlSession session = MyBatisSessionFactory.getSession() ;
		News voA = session.selectOne("cn.mldn.vo.mapping.NewsNS.findById3",10) ;
		voA.setTitle("我就要改，我就喜欢改。");
		System.out.println(voA);
		System.out.println("==========================================");
		MyBatisSessionFactory.getSession().clearCache(); 
		News voB = session.selectOne("cn.mldn.vo.mapping.NewsNS.findById3",10) ;
		System.out.println(voB); 
	}
}
