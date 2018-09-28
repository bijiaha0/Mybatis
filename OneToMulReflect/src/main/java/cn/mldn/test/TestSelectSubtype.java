package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Subtype;
public class TestSelectSubtype {
	public static void main(String[] args) {
		Subtype subtype = MyBatisSessionFactory.getSession().selectOne("cn.mldn.vo.mapping.SubtypeNS.findById", 2);
		System.out.println(subtype);
	}
}
