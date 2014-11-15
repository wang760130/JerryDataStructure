package com.jerry.string;

/**
 * 字符串操作工具类
 * @author Jerry Wang
 *
 */
public class StringUtil {
	public static boolean equal() {
		return false;
	}
	
	public static boolean isEmpty() {
		return false;
	}
	
	public static int length() {
		return 0;
	}
	
	public static String concat(String str1, String str2) {
		return null;
	}
	
	public static String subString(String str, int startIndex) {
		return null;
	}
	
	
	public static String subString(String str, int startIndex, int endIndex) {
		return null;
	}
	
	public static char index(String str, int index) {
		return 'a';
	}
	
	public static int index(String str, char ch) {
		return 0;
	}
	
	public static int index(String str, String subStr) {
		int i = 0;
		int j = 0;
		while(i <= str.length() && j <= subStr.length()) {
			if(str.split("")[i].equals(subStr.split("")[j])) {
//			if(str.charAt(i) == subStr.charAt(j)) {
				++i;
				++j;
			} else {
				i = i - j + 2;
				j = 1;
			}
		}
		if(j > subStr.length())
			return i - subStr.length();
		else
			return 0;
	}
	
	public static String repacle(String str, int index, char ch) {
		return null;
	}
	
	public static String insert(String str, int index, String str2) {
		return null;
	}
	
	public static String delete(String str, int index, int length) {
		return null;
	}
	
	
}
