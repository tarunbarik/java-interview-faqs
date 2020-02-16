import java.util.Scanner;

public class RemoveSpecialChars {

	public static void removeSpecialChars(String input){
      input= input.replaceAll("[^a-zA-Z0-9]","");
	  System.out.println(input);
	}//method

	public static void main(String[] args) {
		//get Scanner class object
		Scanner sc = new Scanner(System.in);
		//read inputs
		System.out.println("Enter String with special chars: ");
		String input = sc.nextLine();
		//method call
		removeSpecialChars(input);
		//close Scanner class object
		sc.close();
	}//main
}//class
