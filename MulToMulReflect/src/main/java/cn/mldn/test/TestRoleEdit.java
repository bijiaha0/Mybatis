package cn.mldn.test;

import cn.mldn.util.MyBatisSessionFactory;
import cn.mldn.vo.Groups;
import cn.mldn.vo.Role;
import cn.mldn.vo.RoleGroupsLink;

public class TestRoleEdit {
	public static void main(String[] args) {
		Role role = new Role();
		role.setRid(2); // 设置要修改的id
		role.setTitle("我的角色");
		int gids[] = new int[] { 2, 4, 6 }; // 表示可以使用的gid数据
		// 1、先更改role数据表中对应的数据
		if (MyBatisSessionFactory.getSession().update("cn.mldn.vo.mapping.RoleNS.doUpdate", role) > 0) {
			// 删除role_groups表中对应的关联数据
			if (MyBatisSessionFactory.getSession().delete("cn.mldn.vo.mapping.RoleNS.doRemoveByRole",
					role.getRid()) > 0) {	// 重新保存新的权限信息
				for (int x = 0; x < gids.length; x++) {
					RoleGroupsLink rgl = new RoleGroupsLink();
					rgl.setRole(role);
					Groups g = new Groups();
					g.setGid(gids[x]);
					rgl.setGroups(g);
					MyBatisSessionFactory.getSession().insert("cn.mldn.vo.mapping.RoleNS.doCreateRoleGroups", rgl);
				}
			}
		}
		MyBatisSessionFactory.getSession().commit();
	}
}
