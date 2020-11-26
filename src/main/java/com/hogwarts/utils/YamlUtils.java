package com.hogwarts.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;

/**
 * @author fyh
 * @date 2020/11/25
 * @desc 读取yaml的工具类
 */
public class YamlUtils {

	private static ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

	public static <T>T readValue(String path, Class<T> valueType){
		try {
			return objectMapper.readValue(YamlUtils.class.getClassLoader().getResourceAsStream(path), valueType);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
