package com.fitt.web.fittws.test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p> Description	: FittesTest.java </p>
 * <p> Copyright	: Copyright (c) 2016 by PCI-SUNTEK</p>
 * <p> Author 		: ZCCHUN </p>
 * <p> Create		: 2016年1月20日 上午10:08:53 </p> 
 * <p> version 		: 1.0 </p>
 */
public class FittesTest {
	public static void main(String[] args) {
		/*JFinal.start("src/main/webapp", 80, "/", 5);*/
		
		boolean result = sss();
		System.out.println(result);
	}
	
	public static boolean sss() {
		Map<String, String> paramMap = new HashMap<String, String>();
		String tableName = "111";
		while(true) {
			
			if ((paramMap != null) && (paramMap.size() >= 1)) break;
	        System.out.println("新增数据  Table[" + tableName + "]异常:无法获取到要插入的列!");
	        return false;
		}
		
		return true;
	}
}
