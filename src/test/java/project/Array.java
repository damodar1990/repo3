package project;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,4,5,6,7};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2==0)
		
			{
				System.out.println(arr[i]);
				break;
			}
			else
			{
			System.out.println("not devisible by 2 :"+ arr[i]);
				
			}
		}
		
		ArrayList<String> arrt=new ArrayList<String>();
		arrt.add("rahul");
		arrt.add("shetty");
		arrt.add("academy");
		System.out.println(arrt.get(1));

	}

}
