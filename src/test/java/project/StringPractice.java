package project;

import java.util.ArrayList;

public class StringPractice {

	public static void main(String[] args) 
	{
		String s="damodar kamath";
		System.out.println(s.charAt(1));
		
		String s1=new String("bola melangadi");
		
		String s2="damodar kamath bola";
		String[] sp=s2.split("kamath");
		System.out.println(sp[0]);
		System.out.println(sp[1]);
		
		System.out.println(sp[1].trim());
		for(int i=0;i<s2.length();i++)
		{
			 System.out.println(s2.charAt(i));
		}
	
		

	}

}
