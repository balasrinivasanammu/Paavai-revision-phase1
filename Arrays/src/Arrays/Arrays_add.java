package Arrays;

public class Arrays_add {
    public static void main(String[] args) {  
        //Initialize array  
       float [] college = new float [] {1.5f, 2, 3, 4, 5,6.5f};  //OR 
    	//int arr[]={1, 2, 3, 4, 5};
        float sum = 0,avg=0;  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < college.length; i++) {  
           sum = sum + college[i];  
           avg=sum/(college.length);
        }  
        System.out.println("Sum of all the elements of an array: " + sum);
        System.out.println("Average "+avg);
    }  
} 

/* 
i=0
sum=0+1
i=1
sum=1+2=3
i=2
sum=3+3=6
i=3
sum=6+4=10
i=4
sum=10+5=15
i=5

avg=sum/i=3

*/



