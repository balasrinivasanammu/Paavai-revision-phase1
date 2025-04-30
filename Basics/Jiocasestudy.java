package Basics;
import java.util.Scanner;

public class Jiocasestudy {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int days,smsp=100,callsp=3000;
float mobile_datap=3;
int sms,calls;
float mobile_data;

System.out.println("enter the number of days: ");
days = sc.nextInt();
  
  if(days<=84)
  {
	  System.out.println("enter the number of sms: ");
	  sms = sc.nextInt();
	  System.out.println("enter the number of calls: ");
	  calls = sc.nextInt();
	  System.out.println("enter the datas used: ");
	  mobile_data =  sc.nextFloat();
	  System.out.println("\npack still valid for: "+ (84-days));
      if(sms<=smsp)
      {
      System.out.println("\nremaining sms are: "+(smsp-sms));
      }
      else
      {
      System.out.println("\nsms limitation is over");
      }
      if(calls<=callsp)
      {
      System.out.println("\nremaing calls are: " + (callsp-calls));
      }
      else
      {
      System.out.println("\nthere is no remaining calls ");
      }
      if(mobile_data<=mobile_datap)
      {
      System.out.println("\nremaing datas are: "+(mobile_datap-mobile_data));
      }
      else
      {
      System.out.println("\nyour data is over");
      }
     
  }
  else
  {
  System.out.println("\npack expired");
  }
  sc.close();
}

}