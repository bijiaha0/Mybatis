package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Type;
public class TestTypeAdd {
	public static void main(String[] args) {
		Type type = new Type();
		type.setTitle("厨房家电");
		System.out.println(MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.TypeNS.doCreate", type));
		MyBatisSessionFactory.getSession().commit();
	}
}
