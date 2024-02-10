package com.String;

public class ReverseofStringWord {

	public static void main(String[] args) {

		String str = "Java Backend Developer";
		
		String[] s = str.split(" ");
		
		System.out.println(s[1]);
		
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]+" ");
		}
	}

}
