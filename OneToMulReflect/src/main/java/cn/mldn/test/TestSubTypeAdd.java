package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Subtype;
import cn.mldn.vo.Type;
public class TestSubTypeAdd {
	public static void main(String[] args) {
		Type type = new Type();
		type.setTid(2);
		Subtype sub = new Subtype();
		sub.setTitle("炒锅");
		sub.setType(type); // 设置匹配关系
		System.out.println(MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.SubtypeNS.doCreate", sub));
		MyBatisSessionFactory.getSession().commit();
	}
}
