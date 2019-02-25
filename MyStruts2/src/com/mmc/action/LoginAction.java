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
		
		//���������
		ActionContext ac=ActionContext.getContext();
        Map<String,Object> map=ac.getSession();
        map.put("suser", this.user);
	}
	
	public String execute(){
		System.out.println(this.user.toString());
		
		//������ת
		return "show";
	}

	@Override
	public User getModel() {
		// TODO �Զ����ɵķ������
        return user;
	}

}
