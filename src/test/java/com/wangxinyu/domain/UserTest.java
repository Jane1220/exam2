/**
 * 
 */
package com.wangxinyu.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * @作者： 王新宇
 * @时间：2020年3月2日
 */
public class UserTest {

	@Test
	public void test() {
		
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setId(i);
			user.setName("111");
			user.setSex("男");
			user.setPhone("1388555589");
			user.setEmail("15556@qq.com");
			user.setDate("2014-10-12");
			list.add(user);
			
		}

		
		long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		
		System.out.println("系列化方式:list,保存数量:100000,所耗时间:"+(e-s));
		
	}

	@Test
	public void test2() {
		
		Map s = new HashMap();
		
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setId(i);
			user.setName("111");
			user.setSex("男");
			user.setPhone("1388555589");
			user.setEmail("15556@qq.com");
			user.setDate("2014-10-12");
			s.putAll(s);
			
		}

		
		long v = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		
		System.out.println("系列化方式:list,保存数量:100000,所耗时间:"+(e-v));
		
		
	}
	@Test
	public void test3() {
		
		List<User> list = new ArrayList<User>();
		
		for (int i = 0; i < 100000; i++) {
			User user = new User();
			user.setId(i);
			user.setName("111");
			user.setSex("男");
			user.setPhone("1388555589");
			user.setEmail("15556@qq.com");
			user.setDate("2014-10-12");
			list.add(user);
			
		}

		
		long s = System.currentTimeMillis();
		long e = System.currentTimeMillis();
		
		System.out.println("系列化方式:json,保存数量:100000,所耗时间:"+(e-s));
		
		
	}


}
