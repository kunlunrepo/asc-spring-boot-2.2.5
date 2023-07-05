package com.msb.spi.mysql;

import com.msb.spi.BaseData;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-04 14:37
 */
public class MySQLData implements BaseData {
	@Override
	public void baseURL() {
		System.out.println("mysql的扩展实现...");
	}
}
