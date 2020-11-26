package com.hogwarts.model;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc 执行的动作
 */
public enum  Action {

	/**
	 * 点击
	 */
	CLICK("click"),

	/**
	 * 发送数据
	 */
	SEND_KEYS("sendkeys");

	private String actionName;

	public String getActionName() {
		return actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	Action(String actionName) {
		this.actionName = actionName;
	}
}
