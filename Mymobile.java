package assignment.week1;
public class Mymobile {
	String Name = "Dharshini R";
	long PhoneNumber = 9095844429l;
	long Msgto = 9095844428l;
	public void makeCall() {
	System.out.println("Make a Call to My Mom");	
	}
	public void sendMsg() {
	System.out.println("Hi");
	}
	private void payBills() {
		// TODO Auto-generated method stub
		System.out.println("My Phone Bill is 200 Rs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mymobile mob = new Mymobile();
		System.out.println(mob.Name);
		System.out.println(mob.PhoneNumber);
		System.out.println(mob.Msgto);
		mob.makeCall();
		mob.sendMsg();
		mob.payBills();
	}
}
