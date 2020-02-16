import java.util.*;

public class TakeArrayInput {
	public static void main(String[] args) {
	  //properties
	  int num,sum=0;
	  //get Scanner class object
	  Scanner sc = new Scanner(System.in);
	  //read inputs
	  System.out.println("Enter the no of elements you want in array: ");
	  num = sc.nextInt();
	 //create array 
	  int arr[] = new int[num];

	  System.out.println("Enter All Elements:");
	  for(int i=0;i<num;i++){
		  arr[i] = sc.nextInt();
		  sum = sum+arr[i];
	  }//for

	//prints the sum of array elements
	System.out.println("Sum of Array: "+sum);
	//close Scanner class object
	sc.close();
	}//main
}//class
