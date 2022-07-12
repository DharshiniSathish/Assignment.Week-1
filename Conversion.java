package assignment.week1;

public class Conversion {
	public static void main(String[] args) {
		int a = -20;
		if(a<0)
		{
			System.out.println("The given number" + a +" is Negative");
			System.out.println("Conversion of given number");
			a = ~(a-1);
			System.out.println("The converted number is" + a + " Positive Number");
		}
	}
	
}
