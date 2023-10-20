package string;

public class BasicOfString {

	public static void main(String[] args) {
	String s1="hello";
	System.out.println(s1.toString());
String s2= new String("hello");
System.out.println(s1.equals(s2));

 char [] ch= {'a','b','c'};
 String s3= new String(ch);
 System.out.println(s3);
 
 byte []b= {65,48,100,120,43,40};
 String s4=new String(b);
 System.out.println(s4);
 

 

	}

}
