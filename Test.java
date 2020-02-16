import java.util.Scanner;

public class Test{
  
private static void print1(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print(i+" ");
     }
    System.out.println();
   }
} 

private static void print2(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<(i*2);j++){
      System.out.print(j+" ");
     }
    System.out.println();
   }
}


private static void print3(int n){
  for(int i=1;i<=n;i++){
    for(int j=i;j>=1;j--){
      System.out.print(j+" ");
     }
    System.out.println();
   }
}


private static void print4(int n){
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
      System.out.print(i+" ");
     }
    System.out.println();
   }
}


private static void print5(int n){
  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
      System.out.print(j+" ");
     }
    System.out.println();
   }
}


private static void print6(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print(j+" ");
     }
    for(int j=i-1;j>=1;j--){
       System.out.print(j+" ");
       }
    System.out.println();
   }
}


private static void print7(int n){
  for(int i=1;i<=n;i++){
    int count=i;
    for(int j=1;j<=i;j++){
      System.out.print(count+" ");
      count = count+5-j;
     }
    System.out.println();
   }
}


private static void print8(int n){
  int count=1;
  for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
      System.out.print(count+" ");
      count++;
     }
    System.out.println();
   }
}


private static void print9(int n){
  for(int i=1;i<=n;i++){
    for(int j=1;j<=3;j++){
      System.out.print(i+" ");
	  i++;
     }
	 i--;
    System.out.println();
   }
}

private static void print10(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j < 4; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= num; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

static void print11(int n) {
		int j, k = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {

				for (j = k + 1; j < k + i; j++)
					System.out.print(j +" ");

				System.out.println(j++);
				k = j;
			} // if

			else {
				k = k + i - 1;
				for (j = k; j > k - i + 1; j--)
					System.out.print(j + " ");
				System.out.println(j);
			} // else
		} // outer for
	}// method
 static void print12(int n) {
		int j, k = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {

				for (j = k + 1; j < k + i; j++)
					System.out.print(j + "*");

				System.out.println(j++);
				k = j;
			} // if

			else {
				k = k + i - 1;
				for (j = k; j > k - i + 1; j--)
					System.out.print(j + "*");
				System.out.println(j);
			} // else
		} // outer for
	}// method
public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Any Number:");
  int n = sc.nextInt();
    //methods call
    print1(n);
    System.out.println();
    print2(n);
    System.out.println();
    print3(n);
    System.out.println();
    print4(n);
    System.out.println();
    print5(n);
    System.out.println();
    print6(n);
    System.out.println();
    print7(n);
    System.out.println();
    print8(n);
    System.out.println();
	print9(n);
	System.out.println();
	print10(n);
	System.out.println();
	print11(n);
	System.out.println();
	print12(n);
    sc.close();
  }//main
}//class