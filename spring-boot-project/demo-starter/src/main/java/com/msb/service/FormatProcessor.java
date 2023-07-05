package com.msb.service;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:36
 */
public interface FormatProcessor {

	// T 任意类型
	<T> String formate(T obj);
}
