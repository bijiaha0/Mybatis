package cn.mldn.test;

import java.io.InputStream;
import java.util.Date;

import cn.mldn.util.MyBatisSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import cn.mldn.mybatisdemo.vo.Member;
import junit.framework.TestCase;

public class TestMemberInsert {
	@Test 
	public void testInsert() throws Exception {
		// 1、需要读取mybatis.cfg.xml配置文件，因为所有的数据库连接以及配置文件路径
		// 因为此时mybatis.cfg.xml保存在CLASSPATH路径中，所以利用Resources类才可以加载CLASSPATH路径下的文件
		InputStream input = Resources.getResourceAsStream("mybatis.cfg.xml") ;
		// 2、当取得了配置文件信息之后就需要通过该配置文件信息创建数据库的连接工厂类对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(input) ;
		// 3、通过SqlSessionFactory可以取得一个SqlSession接口对象， 利用SqlSession可以实现数据操作
		SqlSession session = factory.openSession() ;	// 打开一个新的Session
		// 4、创建VO类对象，所有的数据保存在VO类里面
		Member vo = new Member() ;
		vo.setMid("mldn - wansui");
		vo.setAge(15); 
		vo.setBirthday(new Date());
		vo.setSalary(500.0);
		vo.setName("小李");
		vo.setNote("www.mldnjava.cn");
		// 5、进行数据保存控制，使用指定NS中的指定的语句处理本次执行
		int len = session.insert("cn.mldn.vo.mapping.MemberNS.doCreate", vo) ;
		TestCase.assertEquals(len, 1);	// 如果更新的行数是1，那么就表示成功
		// 6、提交事务，事务需要自己手工提交
		session.commit(); 
		// 7、关闭所有的操作资源
		session.close(); 
		input.close(); 
	}
	@Test
	public void testInsert2() throws Exception {
		Member vo = new Member() ;
		vo.setMid("mldn - f--");
		vo.setAge(15);
		vo.setBirthday(new Date());
		vo.setSalary(500.0);
		vo.setName("小李");
		vo.setNote("www.mldnjava.cn");
		// 5、进行数据保存控制，使用指定NS中的指定的语句处理本次执行
		int len = MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.MemberNS.doCreate", vo) ;
		Logger.getLogger(TestMemberInsert.class).info("数据更新行数：" + len);
		TestCase.assertEquals(len, 1);	// 如果更新的行数是1，那么就表示成功
		// 6、提交事务，事务需要自己手工提交
		MyBatisSessionFactory.getSession().commit();
		MyBatisSessionFactory.close();
	}
}
