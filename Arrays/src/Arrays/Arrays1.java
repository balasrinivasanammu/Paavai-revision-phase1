package Arrays;

class Arrays1 {
	 public static void main(String[] args) {
	  
		 
		 //Syntax for declaration:
		 
		/* dataType[] arr; (or)  
		 dataType []arr; (or)  
		 dataType arr[];*/
		 
		 //Syntax for instantiation:
		 
		 /*int age[]=new int[5];*/
		 
		 
	   // create an array
	   int[] age = {25, 35, 45, 55, 65};
	   
	  /* int age[]=new int[5];//declaration and instantiation  
	   age[0]=10;//initialization  
	   age[1]=20;  
	   age[2]=70;  
	   age[3]=40;  
	   age[4]=50; */ 

	   // access each array elements
	  /* System.out.println("Accessing Elements of Array:");
	   System. .println("First Element: " + age[0]);
	   System.out.println("Second Element: " + age[1]);
	   System.out.println("Third Element: " + age[2]);
	   System.out.println("Fourth Element: " + age[3]);
	   System.out.println("Fifth Element: " + age[4]);*/
	   
	   //OR Using For Iterations
	   //System.out.println(age.length);
	 /*  System.out.println("Using for Loop:");
	   for(int i = 0; i < age.length; i++) { // to find the size or length of an array
	     System.out.println(age[i]);
	   }*/
	   
	   // OR Using Foreach iterations
	   
	   System.out.println("Using for-each Loop:");
	   for(int a : age) {
	     System.out.println(a);
	   }
	 }
	}
