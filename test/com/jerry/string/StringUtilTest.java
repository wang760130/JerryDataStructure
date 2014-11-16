package com.jerry.string;

import org.junit.Test;

public class StringUtilTest {
	
	@Test
	public void indexTest() {
		int index = StringUtil.index("abcdefg", "cdef");
		System.out.println(index);
	}
}
