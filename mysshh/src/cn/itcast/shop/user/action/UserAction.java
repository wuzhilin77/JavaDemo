package cn.itcast.shop.user.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.itcast.shop.user.service.UserService;
import cn.itcast.shop.user.vo.User;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


/**
 * 用户模块Action的类
 * 
 * @author xiao
 * 
 */
public class UserAction extends ActionSupport implements ModelDriven<User> {
	//模型驱动使用的对象
	private User user=new User();
	public User getModel(){
		return user;
	}
	
	// 注入UserService
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 登陆
	 */
	public String login(){
		User existUser=userService.login(user);
		if(existUser==null){
			//登陆失败
			this.addActionError("登陆失败：用户名或密码错误用户未激活！");
			return LOGIN;
		}else {
			//登陆成功
			//将用户的信息存入session中
			ServletActionContext.getRequest().getSession().setAttribute("existUser", existUser);
			//页面跳转
			return "loginSuccess";
		}

	}
	
}
