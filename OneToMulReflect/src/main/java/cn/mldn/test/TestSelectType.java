package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Type;
public class TestSelectType {
	public static void main(String[] args) {
		Type type = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.TypeNS.findById", 2);
		System.out.println(type);
		System.out.println(type.getSubtypes());
	}
}
