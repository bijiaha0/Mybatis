package cn.mldn.test;
import java.util.LinkedList;
import java.util.List;
import cn.mldn.util.MyBatisSessionFactory;
public class  NewsDelete2 {
	public static void main(String[] args) throws Exception {
		List<Integer> ids = new LinkedList<Integer>();
		ids.add(2); 
		ids.add(3);
		ids.add(4);
		System.out.println(
				MyBatisSessionFactory.getSession().delete("cn.mldn.vo.mapping.NewsNS.doRemoveBatch", ids.toArray()));
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
