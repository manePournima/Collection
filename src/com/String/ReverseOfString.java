
package com.String;


public class ReverseOfString {
	
	static String str1 =  "I Can Do it";
	
	public static String reversestring(String s)
	{
		String str ="";
		
		for(int i =s.length()-1; i >= 0 ;i--) {

			 str = str + s.charAt(i);
	}
		return str;
	
	}
	
	
	public static boolean palindrome(String st1)
	{
//		  if (st1.trim().equalsIgnoreCase(reversestring(st1.trim()))) { 
//			  return true;
//		  } else 
//			  return false;
//		 	}
	
	return st1.trim().equalsIgnoreCase(reversestring(st1.trim()))?true:false;
	}
	public static void main(String[] args) {
		//reverse of string
		System.out.println(reversestring(str1));
		//palindrom
		System.out.println(palindrome("madam "));
		
	}
}

