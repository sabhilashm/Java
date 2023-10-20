package array;

import java.util.Scanner;

public class Static2DArray {

	public static void main(String[] args) {
	
		int [] [] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int []f:a)
		{
			for(int g:f)
			{
				System.out.print(g+"  ");
			}
			System.out.println();
		}
	}
	
	

}
