package com.akash.junit.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class executed");
	}

	@Before
	public void beforeTest(){
		System.out.println("before test executed");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 executed");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 executed");
	}
	
	@After
	public void afterTest() {
		System.out.println("After test executed");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class method executed");
	}
}
