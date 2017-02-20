package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;

/**
* @ClassName: UserService   
* @Description: 登录用户service层 
* @author 宋笑  
* @date 2015-10-8 下午03:34:45   
*
 */
@Transactional
public class UserService {
	//对UserDao的注入
	private UserDao userDao;

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//登录方法
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}
	
	
}
