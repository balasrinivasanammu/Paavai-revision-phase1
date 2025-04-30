package Basics;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//byte age=20;
		//String s = "Balaji";
		//char name = 'N';
		//System.out.println(name);
		//System.out.println("Balaji="+age);
		/*System.out.println("balaji 2001");
		System.out.println("balaji "+3001);
		System.out.println(2001+10+" Balaji");
		System.out.println(2001+" Balaji "+10);
		System.out.println("Balaji "+2001+10+20);
		System.out.println("Balaji",System.out.println("hello"));
		 */
		int num1=10,num2=10,num3=30,num4=40,num5=50;
		int large;
		large = (num1>num2 &&num1>num3 &&num1>num4 && num1>num5)?(large=num1):(large=num5):(num2>num3 &&num2>num4 && num2>num5)(large=num2):(large=num5);		
		System.out.println("Large="+large);
	}

}
