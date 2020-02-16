import java.util.Scanner;

public class ReverseString {
	 static void reverseString(String input){
         String revs="";
		 int length = 0;
		 length = input.length();
		 for(int i=length-1;i>=0;i--){
		     revs = revs+input.charAt(i);
		 }//for
		 System.out.println(revs);
	 }//reverseString(-)

	public static void main(String[] args) {
		//get Scanner class object
		Scanner sc = new Scanner(System.in);
		//read inputs
		System.out.println("Enter Any String :");
		String input = sc.nextLine();
		//method call
		reverseString(input);  
		//close Scanner class object
		sc.close();
	}//main
}//class
