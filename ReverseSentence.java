import java.util.Scanner;

public class ReverseSentence {
	static void revs(String input){
       String rev = "";
	   String [] temp = input.split(" " );
	   for(int i=temp.length-2;i>=0;i--){
		   if(i>0){
			rev += temp[i]+" ";
		   }else{
			   rev += temp[i] + " " + temp[temp.length - 1];
		   }
	   }//for
	   System.out.println(rev);
	}//revs(-)
	public static void main(String[] args) {
		//get Scanner class object
		Scanner sc = new Scanner(System.in);
		//read inputs
		System.out.println("Enter Any Sentence: ");
		String in  = sc.nextLine();
		//method call
		revs(in);
		//close Scanner class object
		sc.close();
	}//main
}//class
