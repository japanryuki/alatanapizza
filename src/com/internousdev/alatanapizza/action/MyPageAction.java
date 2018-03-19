package com.internousdev.alatanapizza.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.alatanapizza.dao.MyPageDAO;
import com.internousdev.alatanapizza.dto.MyPageDTO;
import com.internousdev.alatanapizza.util.ErrorMessageConstants;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware, ErrorMessageConstants {

	/**
	 * 1.ログイン状態か確認(sessionにuserIdがあればログイン状態)
	 * 2.未ログインならerrorとし、ホーム画面に返す
	 * 3.ログイン状態ならユーザー登録情報を取得し、successマイページへ遷移
	 * @param userId
	 */

	// userId格納
	private String userId;
	// session情報格納
	private Map<String, Object> session;
	// ログイン情報格納DTO
	private ArrayList<MyPageDTO> myPageList = new ArrayList<MyPageDTO>();

	// エラーメッセージ
	private String message;

	public String execute() {




		/*---------------------------------------------------------
		 セッション情報取得
		---------------------------------------------------------*/
		if (!(session.containsKey("userId"))) {//loginページで設定 <s:if test="Message!=''">

			setMessage("このサービスをご利用になるにはログインしてください。");

		}
		String result = ERROR;



		/*---------------------------------------------------------
		    ユーザー情報取得
		    @param userId
		 ---------------------------------------------------------*/
		if (session.containsKey("userId")) {
			userId = session.get("userId").toString();
			MyPageDAO dao = new MyPageDAO();

	    /*---------------------------------------------------------
	     	sessionからuserIDをキーにして情報を受け取り、
	     	SQLでIDと一致する項目をselectし、ユーザー情報を
	     	変数MyPageDTOにセットし、mypagelist配列に代入。
			リストにデータが入っていたらSUCCESSとなりマイページに遷移。
		---------------------------------------------------------*/
			myPageList = dao.getMyPageUserInfo(userId);
			if (myPageList.size() > 0) {
				result = SUCCESS;
			}
		}
		return result;
	}


	//ゲッター・セッター
	//----------------------------------------------

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

	//----------------------------------------------

	public ArrayList<MyPageDTO> getMyPageList() {
		return myPageList;
	}


	public void setMyPageList(ArrayList<MyPageDTO> myPageList) {
		this.myPageList = myPageList;
	}

	//----------------------------------------------

	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}
	//----------------------------------------------


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	//----------------------------------------------

}