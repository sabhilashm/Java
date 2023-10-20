package string;

import java.util.Iterator;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer g= new StringBuffer("Java");
		System.out.println(g.reverse());
		
		
		
		
		String s="Java";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
			System.out.println(r);	
			
		
			
			
			String t="Welcome to bang";
			String [] h=t.split(" ");
			String y="";
			for(String k:h)
			{
				String l="";
				for(int i=k.length()-1;i>=0;i--)
				{
					l=l+k.charAt(i);
				}
				y=y+l+" ";
			}
			System.out.println(y);
		
	}

}

