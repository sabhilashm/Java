package array;

import java.util.Scanner;

public class DynamicTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		int[][] s= new int[3][3];
		System.out.println("Enter arry "+s.length+" element");
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s[i].length;j++)
			{
				s[i][j]=sc.nextInt();
			}
		}
	for(int [] a:s)
	{
		for(int f: a)
		{
			System.out.print(f+" ");
		}
		System.out.println();
	}

	}

}

