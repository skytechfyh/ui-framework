package com.hogwarts.framework;

import com.hogwarts.core.TestCase;
import com.hogwarts.utils.YamlUtils;
import org.junit.jupiter.api.Test;

import java.util.Objects;

/**
 * @author fyh
 * @date 2020/11/26
 * @desc
 */
public class TestFramework {

	@Test
	public void testFrameWork(){

		TestCase testCase = YamlUtils.readValue("search.yaml", TestCase.class);

		Objects.requireNonNull(testCase).run();
	}
}
