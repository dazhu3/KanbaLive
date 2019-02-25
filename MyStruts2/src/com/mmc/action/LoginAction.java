package com.mmc.action;

import java.util.Map;

import com.mmc.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=null;

	public LoginAction() {
		this.user=new User();
		
		//设置域对象
		ActionContext ac=ActionContext.getContext();
        Map<String,Object> map=ac.getSession();
        map.put("suser", this.user);
	}
	
	public String execute(){
		System.out.println(this.user.toString());
		
		//就是跳转
		return "show";
	}

	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
        return user;
	}

}
