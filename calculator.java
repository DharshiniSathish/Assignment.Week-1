package assignment.week1;

public class calculator {
	
	public void add(int num1, int num2, int num3) {
		int sum = num1+num2+num3;
		System.out.println("sum = " +sum);
		}
	public void sub(int num1, int num2) {
		int sub = num1-num2;
		System.out.println("sub = " +sub);
		}
	public void mul(double num1, double num2 ) {
		double mul = num1*num2;
		System.out.println("product = " +mul);
		}
	public void divide(float num1, float num2) {
		float div =  num1/num2;
		System.out.println("division = " +div);
	}
}

