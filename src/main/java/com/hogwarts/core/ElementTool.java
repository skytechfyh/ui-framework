package com.hogwarts.core;

import com.hogwarts.model.Action;
import com.hogwarts.model.Element;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc
 */
public class ElementTool {


	/**
	 * 获取元素对象
	 * @param driver  驱动
	 * @param element	Element
	 * @return	WebElement
	 */
	public WebElement getElement(WebDriver driver, Element element){
		WebElement expectElement = null;
		if (StringUtils.isNotEmpty(element.getId())){
			expectElement = driver.findElement(By.id(element.getId()));
		}

		if (StringUtils.isNotEmpty(element.getXpath())){
			expectElement = driver.findElement(By.xpath(element.getXpath()));
		}

		if (StringUtils.isNotEmpty(element.getCss())){
			expectElement = driver.findElement(By.cssSelector(element.getCss()));
		}

		return expectElement;
	}

	/**
	 * 执行动作
	 * @param driver	驱动
	 * @param element	Element
	 * @param testCase	测试用例
	 */
	public void executeAction(WebDriver driver, Element element, TestCase testCase){
		WebElement expectElement = getElement(driver, element);
		String action = element.getAction();
		if (action.contains(Action.CLICK.getActionName())){
			expectElement.click();
		}

		if (action.contains(Action.SEND_KEYS.getActionName())){
			expectElement.sendKeys(testCase.getData().get(testCase.index));
		}
	}



}
