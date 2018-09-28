package cn.mldn.test;
import java.util.HashSet;
import java.util.Set;
import cn.mldn.util.MyBatisSessionFactory;
//批删除
public class NewsDelete {
	public static void main(String[] args) throws Exception {
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(2);
		ids.add(3);
		ids.add(4);
		System.out.println(
				MyBatisSessionFactory.getSession().delete("cn.mldn.vo.mapping.NewsNS.doRemoveBatch", ids.toArray()));
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
