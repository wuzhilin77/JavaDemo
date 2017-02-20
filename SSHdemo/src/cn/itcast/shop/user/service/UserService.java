package cn.itcast.shop.user.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.shop.user.dao.UserDao;
import cn.itcast.shop.user.vo.User;

/**
* @ClassName: UserService   
* @Description: ��¼�û�service�� 
* @author ��Ц  
* @date 2015-10-8 ����03:34:45   
*
 */
@Transactional
public class UserService {
	//��UserDao��ע��
	private UserDao userDao;

	/**
	 * @param userDao the userDao to set
	 */
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	//��¼����
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}
	
	
}
