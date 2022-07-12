package assignment.week1;

public class Range {
		
	public static void main(String[] args) {
	 System.out.println("List of Odd Numbers from 1 to 20");
	  for(int i = 1;i<=20;i++) {
		 if(i%2!=0) {
			 System.out.println(i);
		 }
		 else {
			 i=i++;
		 }
	 }
	}
	
}
