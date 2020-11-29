package com.hogwarts.framework;

import com.hogwarts.core.TestCase;
import com.hogwarts.utils.YamlUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc
 */
public class TestFramework {

	@ParameterizedTest
	@MethodSource("initData")
	public void testFrameWork(TestCase testCase){
		testCase.run();
	}

	static List<TestCase> initData(){
		TestCase testCase = YamlUtils.readValue("framework/search.yaml", TestCase.class);
		assert testCase != null;
		return testCase.generateTestCase();
	}
}
