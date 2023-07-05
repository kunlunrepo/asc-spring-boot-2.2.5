package com.msb.bean;

import com.msb.properties.HelloProperties;
import com.msb.service.FormatProcessor;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:48
 */
public class HelloFormatTemplate {

	private FormatProcessor formatProcessor;

	private HelloProperties helloProperties;

	public HelloFormatTemplate(HelloProperties helloProperties, FormatProcessor processor) {
		this.helloProperties = helloProperties;
		this.formatProcessor = processor;
	}

	public <T> String doFormat(T obj) {
		StringBuilder builder = new StringBuilder();
		builder.append("Execute format : ").append("<br>");
		builder.append("HelloProperties:").append(formatProcessor.formate(helloProperties.getInfo())).append("<br>");
		builder.append("Object format result:").append(formatProcessor.formate(obj));
		return builder.toString();
	}
}
