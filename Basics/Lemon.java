package Basics;

public class Lemon {

	public static  main(String[] args) {
		// TODO Auto-generated method stub
		int lem=25,t=0;
		  String str;
		  str=(lem==21)?"equal":(lem<21)?"need":"extra";
		  t=(str=="need")?21-lem:lem-21;
		  system.out.println(t+" lemons "+str);

	}

}

