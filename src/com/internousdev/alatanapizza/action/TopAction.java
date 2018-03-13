package com.internousdev.alatanapizza.action;
import java.util.Map;
import java.util.Random;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class TopAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	Random rdm=new Random();

	public String execute(){
		try{
		if (!(session.containsKey("loginFlg"))) {
			session.put("loginFlg", false);
			double guestId=Math.random();
			session.put("guestId",guestId);
			System.out.println("--------");
			System.out.println(guestId);
			System.out.println(session.get("loginFlg"));
	}


		}catch(Exception e){
			e.printStackTrace();
			}

		/*if ((boolean)session.get("loginFlg")) {
			miniCartList = cartDAO.UserMiniCart(session.get("userId").toString());

			session.put("miniCartList", miniCartList);
		}else {
			miniCartList = cartDAO.TempUserMiniCart(session.get("tempUserId").toString());

			session.put("miniCartList", miniCartList);
		}*/

return SUCCESS;
}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	}