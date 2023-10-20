package override;

public class EqualesUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsOverRiding ur= new EqualsOverRiding("Abhi", 123, 5);
		System.out.println(ur);
		EqualsOverRiding ur1= new EqualsOverRiding("Abhi", 123, 5);
		System.out.println(ur.equals(ur1));
		System.out.println(ur==ur1);
		

	}

}
