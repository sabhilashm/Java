package string;

public class StringToUpperAndLowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String  r= "GooD";
	String f="";
	for(int i=0;i<r.length();i++)
	{
		char c=r.charAt(i);
		if(Character.isLowerCase(c)) {
			f=f+(char)(c-32);
		}
		else {
			f=f+(char)(c+32);
		}
	
	}
	System.out.println(f);
			}

}
