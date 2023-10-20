package string;

public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1= "  Good  ";
		String s2= new String("  Good  ");
		String s3= new String("  GOOd  ");
		String s4="";
		String s5="Hi";
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s1.concat(" Morning"));
		
		System.out.println(s1.trim());
		
		System.out.println(s1.substring(4));
		
		System.out.println(s1.substring(2, 6));
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.lastIndexOf('G'));
		
		System.out.println(s1.indexOf('G'));
		
		System.out.println(s1.length());
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1.contains("Go"));
		
		System.out.println(s4.isEmpty());
		
		char [] c=s5.toCharArray();
		for(char ch:c)
		{
			System.out.println(ch);
		}
		
		String s6="Java is a programing lang";
		String [] s7=s6.split(" ");
		for (String string : s7) {
			System.out.println(string);
		}
		
		byte [] b =s5.getBytes();
		int rev=0;
		for (byte d : b) {
			System.out.println(d);
			rev=rev+d;
		}
		System.out.println(rev);
		
		
	String s8="java";
	String s9="python";
	System.out.println(s8.compareTo(s9));
	System.out.println(s9.compareTo(s8));
	System.out.println(s9.compareTo("python"));
		
		
		
		
		
		
	}

}
