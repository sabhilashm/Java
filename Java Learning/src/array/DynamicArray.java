package array;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter arry size");
		int [] a=new int[sc.nextInt()];
		System.out.println("Enter "+a.length+" element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The out put of array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println(a[3]);
	}

}
