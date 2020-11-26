package com.hogwarts.model;

import java.util.List;

/**
 * @author fyh
 * @date 2020/11/25
 * @desc
 */
public class Step {

	private String browser;

	private String implicitlyWait;

	private String url;

	private List<Element> elements;

	private boolean close;

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getImplicitlyWait() {
		return implicitlyWait;
	}

	public void setImplicitlyWait(String implicitlyWait) {
		this.implicitlyWait = implicitlyWait;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Element> getElements() {
		return elements;
	}

	public void setElements(List<Element> elements) {
		this.elements = elements;
	}

	public boolean isClose() {
		return close;
	}

	public void setClose(boolean close) {
		this.close = close;
	}
}
