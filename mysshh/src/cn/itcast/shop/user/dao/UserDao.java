package cn.itcast.shop.user.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.shop.user.vo.User;

/**
 * @ClassName: UserDao
 * @Description: 用户管理持久层
 * @author 宋笑
 * @date 2015-10-8 下午03:36:03
 * 
 */
public class UserDao extends HibernateDaoSupport {
	// 用户登陆的方法
	public User login(User user) {
		// TODO Auto-generated method stub
		String hql = "from User where username=? and password=? and state=?";
		List<User> list = this.getHibernateTemplate().find(hql,
				user.getUsername(), user.getPassword(), 1);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}

		return null;
	}
}
