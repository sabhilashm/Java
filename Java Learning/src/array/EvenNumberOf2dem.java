package array;

public class EvenNumberOf2dem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int [][] a= {{1,2,3},{4,5,6},{7,8,9}};
	for(int [] f:a)
	{
		for(int g:f)
		{
			if(g%2==0)
			{
				System.out.print(g+" ");
				
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println( );
	}
	}
}
