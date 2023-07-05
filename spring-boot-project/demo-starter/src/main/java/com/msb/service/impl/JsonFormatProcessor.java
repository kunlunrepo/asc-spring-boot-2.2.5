package com.msb.service.impl;

import com.alibaba.fastjson.JSON;
import com.msb.service.FormatProcessor;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:39
 */
public class JsonFormatProcessor implements FormatProcessor {
	@Override
	public <T> String formate(T obj) {
		return "JsonFormatProcessor:" + JSON.toJSONString(obj);
	}
}
