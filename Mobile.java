package week1.day2;

public class Mobile {

	public static void main(String[] args) {
		Mobile objName= new Mobile();
		System.out.println(objName.makeCall());
		System.out.println(objName.sendMsg());
		
		

	}
	public long makeCall() {
		
		return(12345678561L);
		
	}
	public String sendMsg() {
		
		return "Message";

}
}
