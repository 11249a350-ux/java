/*A350
AIM:To write a Java program to generate the Fibonacci series
for a given number of terms.
ALGORITHM:
1. Start the program.
2. Get the value of n from the user.
3. Call the Fibonacci function with n.
4. If n is 0, display 0.
5. If n is 1, display 0 and 1.
6. Otherwise, initialize the first two numbers as 0 and 1.
7. Add the two numbers to find the next number.
8. Display the next number and update the values.
9. Repeat the process until n terms are displayed.
10. Stop the program.
PROGRAM*/
import java.util.Scanner; public class FibonacciSeries {
public static void main(String[] args) { Scanner s = new Scanner(System.in); System.out.print("Enter the value of n: "); int n = s.nextInt();
fibonacci(n);
}
public static void fibonacci(int n) { if (n == 0) {
System.out.println("0");
} else if (n == 1) { System.out.println("0 1");
} else {
System.out.print("0 1 "); int a = 0;
int b = 1;
for (int i = 1; i < n; i++) { int nextNumber = a + b;
System.out.print(nextNumber + " ");
a = b;
b = nextNumber;
}
}
}
}
/*OUTPUT:
Enter the value of n: 7
0 1 1 2 3 5 8
RESULT:Thus, the Java program to generate the Fibonacci series
was successfully executed.*/
