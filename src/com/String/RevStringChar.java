package com.String;

public class RevStringChar {

	
		String s = "The Java Developer";
		
		String str = "";
		
		public String reverstring()
		{		
		for(int i = s.length()-1;i>=0;i--)
		{
			str = str+s.charAt(i);
			
		}
		return str;
		}
	
public static void main(String[] args) {
	RevStringChar rsc = new RevStringChar();
	System.out.println(rsc.reverstring());
}
}