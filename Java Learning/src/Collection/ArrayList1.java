package Collection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar= new ArrayList();
		ar.add("123");
		ar.add("abhi");
		ar.add(1, "sang");
		System.out.println(ar);
		ar.remove(1);
		System.out.println(ar);
		ArrayList ar1= new ArrayList();
		ar1.addAll(ar);
		System.out.println(ar1);
		System.out.println(ar.contains("abhi"));
	}

}
