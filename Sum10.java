/*Sum of 1st 10 Natural Numbers

Logic: Sum of previous two numbers will give us next number.
*/
package org.apps;

public class Sum10 {
	public static void main(String args[]) {
		int n, sum = 0;

		for (n = 1; n <= 10; n++) {
			sum += n; // or sum=sum+n;
		}

		System.out.println(sum);
	}// main
}// class
