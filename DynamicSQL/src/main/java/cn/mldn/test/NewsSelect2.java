package cn.mldn.test;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.News;
public class NewsSelect2 {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", 1) ;
		map.put("lineSize", 5) ;
		map.put("column", "title") ;
		map.put("keyWord", "世界混乱了。") ;
		List<News> all = MyBatisSessionFactory.getSession().selectList("cn.mldn.vo.mapping.NewsNS.findAllSplit", map);
		System.out.println(all);
	}
}
