package com.hogwarts.model;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc 元素的定位与动作
 */
public class Element {

	private String id;

	private String xpath;

	private String css;

	private String action;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public String getCss() {
		return css;
	}

	public void setCss(String css) {
		this.css = css;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
