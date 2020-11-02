package com.akash.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraysSort_Basic() {
		int[] num = {1,2,4,10,9};
		int[] expected = {1,4,2,9,10};
		
		Arrays.sort(num);
		
		assertArrayEquals(expected, num);
		
	}

}
