package com.lewisliu.action;

import com.opensymphony.xwork2.ActionSupport;

public class Layout extends ActionSupport{
	
	public String page;
	public String layout;
	public String view(String page,String layout){
		this.page = page;
		this.layout = "/WEB-INF/view/layout/" + layout + ".html";
		return layout;
	}
	
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}

	public String getLayout() {
		return layout;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}
	
}
