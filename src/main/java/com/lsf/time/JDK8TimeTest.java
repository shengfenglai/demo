
package com.lsf.time;

import java.time.LocalDate;

/**
 * @author allen
 *
 */
public class JDK8TimeTest {

	public static void main(String[] args) {
		getNow();
	}

	public static void getNow() {
		//获取当前时间年月日yyyy-MM-dd
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}
	
	

}
