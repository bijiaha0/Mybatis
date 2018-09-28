package cn.mldn.test;
import org.apache.ibatis.session.SqlSession;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;
//二级缓存
public class TestSecondCache {
	public static void main(String[] args) {
		// 定义两个SqlSession接口对象，这样表示两个不同的线程操作
		SqlSession sessionA = MyBatisSessionFactory.getFactory().openSession() ;
		SqlSession sessionB = MyBatisSessionFactory.getFactory().openSession() ;
		News voA = sessionA.selectOne("cn.mldn.vo.mapping.NewsNS.findById3",10) ;
		System.out.println(voA);
		sessionA.close();
		System.out.println("==========================================");
		MyBatisSessionFactory.getSession().clearCache(); 
		News voB = sessionB.selectOne("cn.mldn.vo.mapping.NewsNS.findById3",10) ;
		System.out.println(voB);
		sessionB.close();
	}
}
