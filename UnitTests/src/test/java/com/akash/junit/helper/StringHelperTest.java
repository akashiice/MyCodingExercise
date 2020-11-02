package com.akash.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper stringHelper;
	
	@Before
	public void before() {
		stringHelper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_1() {
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_2() {
		assertEquals("AAA", stringHelper.truncateAInFirst2Positions("AAAAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("AKASH"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AKAK"));
	}

}
