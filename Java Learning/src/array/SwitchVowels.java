package array;

import java.util.Scanner;

public class SwitchVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the char");
		String c= sc.next();
		
		
		switch (c) {
		case "a":
		{
			System.out.println(c+" is a Vowels");
			break;
		}
			
			

		default:
		{
		System.out.println(c+" is not a Vowel");
		break;
		}
			
		}

	}

}
