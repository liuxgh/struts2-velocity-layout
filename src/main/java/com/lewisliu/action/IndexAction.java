package com.lewisliu.action;

public class IndexAction extends Layout{

	public String layout = "layout";
	public String a(){
		page = "/WEB-INF/view/module/a.html";
		String rt = view(page,layout);
		return rt;
	}
	public String b(){
		page = "/WEB-INF/view/module/b.html";
		return view(page,layout);
	}
}
