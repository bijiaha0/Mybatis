package cn.mldn.test;
import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Groups;
import cn.mldn.vo.Role;
import cn.mldn.vo.RoleGroupsLink;
public class TestRoleAdd {
	public static void main(String[] args) {
		Role role = new Role();
		role.setTitle("自定义角色");
		int gids[] = new int[] { 1, 3, 5 }; // 表示可以使用的gid数据
		MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.RoleNS.doCreate",role) ;
		MyBatisSessionFactory.getSession().commit();// 保存成功取得rid数据
		for (int x = 0 ; x < gids.length ; x ++) {
			RoleGroupsLink rgl = new RoleGroupsLink() ;
			rgl.setRole(role);
			Groups g = new Groups() ;
			g.setGid(gids[x]);
			rgl.setGroups(g);
			MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.RoleNS.doCreateRoleGroups",rgl) ;
		}
		MyBatisSessionFactory.getSession().commit();
	}
}
