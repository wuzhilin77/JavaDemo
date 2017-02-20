package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * �û�ģ��Action����
 * 
 * @author xiao
 * 
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	//ģ������ʹ�õĶ���
	private User user=new User();
	public User getModel(){
		return user;
	}
	
	// ע��UserService
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * ��½
	 */
	public String login(){
		User existUser=userService.login(user);
		if(existUser==null){
			//��½ʧ��
			this.addActionError("��½ʧ�ܣ��û�������������û�δ���");
			return LOGIN;
		}else {
			//��½�ɹ�
			//���û�����Ϣ����session��
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			//ҳ����ת
			return "loginSuccess";
		}

	}
	
}
