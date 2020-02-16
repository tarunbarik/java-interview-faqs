/*Sum of Square of 1st 10 Natural Numbers
Logic: Sum of previous two numbers will give us next number.*/
package org.apps;

public class SumSq10 {
	public static void main(String args[]) {
		int n, sum = 0;
		for (n = 1; n <= 10; n++) {
			sum += n * n; // or sum=sum+n*n;
		}
		System.out.println(sum);
	}// End of main method
}// End of class