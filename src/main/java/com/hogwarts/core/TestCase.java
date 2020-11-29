package com.hogwarts.core;

import com.hogwarts.model.Step;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc  测试用例
 */
public class TestCase {

	private List<String> data;

	private Step steps;

	private WebDriver driver;

	private final ElementTool elementTool = new ElementTool();

	public List<String> getData() {
		return data;
	}

	public void setData(List<String> data) {
		this.data = data;
	}

	public Step getSteps() {
		return steps;
	}

	public void setSteps(Step steps) {
		this.steps = steps;
	}

	public int index;

	public List<TestCase> generateTestCase(){
		List<TestCase> testCaseList = new ArrayList<>();
		for (int i = 0; i < data.size(); i++) {
			TestCase newTest = new TestCase();
			newTest.steps = steps;
			newTest.data = data;
			newTest.index = i;

			testCaseList.add(newTest);
		}

		return testCaseList;
	}


	public void run(){
		// 设置driver
		if (StringUtils.isNotEmpty(steps.getBrowser())){
			driver = DriverFactory.getDriver().getBrowser(steps.getBrowser());
		}else {
			driver = DriverFactory.getDriver().getBrowser("chrome");
		}

		// 设置隐式等待
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(steps.getImplicitlyWait()), TimeUnit.SECONDS);

		driver.get(steps.getUrl());

		steps.getElements().forEach(element -> {
			elementTool.executeAction(driver, element, this);
		});

		if (steps.isClose()){
			driver.quit();
		}
	}
}
