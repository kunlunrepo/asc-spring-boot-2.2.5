package com.msb.spi.oracle;

import com.msb.spi.BaseData;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-04 14:48
 */
public class OracleData implements BaseData {
	@Override
	public void baseURL() {
		System.out.println("oracle的扩展实现...");
	}
}
