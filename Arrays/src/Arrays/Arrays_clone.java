package Arrays;


class Arrays_clone{  
public static void main(String args[]){
	
	// 1 St Array CSE
int CSE[]={10,20,30,40,50};  
System.out.println("Printing original array:");  
for(int i:CSE)  
System.out.println(i);  
  
//2nd array ( IT )- to clone it from 1st array CSE
System.out.println("Printing clone of the array:");  
int IT[]=CSE.clone();  
for(int i:IT)  
System.out.println(i);  
  
System.out.println("Are both equal?");  
System.out.println(CSE==IT);  
  
}
}




