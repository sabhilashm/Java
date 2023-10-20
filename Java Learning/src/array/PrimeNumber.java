package array;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter arry size");
		int []a =new int [sc.nextInt()];
		System.out.println("Enter arry "+a.length+" list");
		for(int i=0;i<a.length;i++)
		
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length;i++)
		{
			if(prime(a[i])!=0)
			{
				System.out.println(a[i]);
			}
		}

	}
	public static void prime(int n)
	{
		int cout=0;
		for (int i=1;i<=n;i++)
		{
			if (n%i==0)
			{
				cout++;
			}
		}
		if (cout==2)
		{
			return;
		}
	}
}


	


