package com.mmc.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;

import com.mmc.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=null;
	
	private List<String> list=null;

	public UserAction() {
		this.user=new User();
	}
	
	public String login(){
		System.out.println("login");
		System.out.println(list);
		
		//设置域对象
		ActionContext ac=ActionContext.getContext();
        Map<String,Object> map=ac.getSession();
        map.put("suser", this.user);
		
		return "show";
	}
	
	@Action("myUser")
	public String register(){
		System.out.println("register");
		return null;
	}

	@Override
	public User getModel() {
		// TODO 自动生成的方法存根
        return user;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

}
