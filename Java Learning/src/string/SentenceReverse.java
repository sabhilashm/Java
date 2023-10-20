package string;

import java.util.Scanner;

public class SentenceReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Welcome to bang";
		String [] s2=  s.split(" ");
		String rev="";
		for(String s1:s2)
		{String r="";
			for(int i=s1.length()-1;i>=0;i--)
			{
				
				r=r+s1.charAt(i);
			}
			rev=rev+r+" ";
		}
		System.out.println(rev);
	}

}
