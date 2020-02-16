
public class SortArrayByBubbleSort {
		public static void sort(int input[]) {
		int temp = 0;
		for (int i = 0; i <= input.length - 1; i++) {

			for (int j = i + 1; j <= input.length - 1; j++) {
				if (input[i] > input[j]) {
				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				}
			}
		  System.out.println(input[i]);
			}
		}//sort(-0
	public static void main(String[] args) {
			int[] i = new int[] { 12, 44, 23, 43, 21, 8, 0, 6, 45, 44, 58, 17 };
			//method call
			sort(i);
		}//main
	}//class