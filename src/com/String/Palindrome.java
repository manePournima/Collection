package com.String;

public class Palindrome {

	//String str ="Madam";
	
	public static boolean palidrom(String st) {
	
		for(int i=st.length()-1;i>=0;i--)
		{
			if(st.equalsIgnoreCase(st)) {
				return true;
			}
			else
				return false;
		
		//return true;
	}
	public static void main(String[] args) {
		System.out.println(palidrom("pournima"));

	}
	
}
