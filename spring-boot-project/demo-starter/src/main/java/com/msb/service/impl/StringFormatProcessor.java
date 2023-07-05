package com.msb.service.impl;

import com.msb.service.FormatProcessor;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:40
 */
public class StringFormatProcessor implements FormatProcessor {
	@Override
	public <T> String formate(T obj) {
		return "StringFormatProcessor:" + obj.toString();
	}
}
