package Basics;

public class Withoutmain {
	public static void main(String args[])
	{
		int a=15,b=20,c=25,d=30;
		if(a>100 | ++a<b | ++a<c | a++<d)
		{
			System.out.println("Hello"+a);
		}
		else
		{
			System.out.println("Hai"+a);
		}
	}

}
