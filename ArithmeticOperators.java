/*A350
AIM:
To write a Java program to perform arithmetic operations such as addition, subtraction, multiplication, division, and modulus on two numbers using a menu-driven program.
Algorithm:
1.Start the program.
2.Create a Scanner object to read input from the user.
3.Enter an infinite loop to repeatedly perform operations.
4.Read two integer values x and y.
5.Display the menu:
-Addition
-Subtraction
-Multiplication
-Division
-Modulus
-Exit
-Read the user's choice.
6.Use a switch statement to perform the selected operation:
-If choice is 1, calculate x + y.
-If choice is 2, calculate x - y.
-If choice is 3, calculate x * y.
-If choice is 4, calculate x / y, after checking that y is not zero.
-If choice is 5, calculate x % y.
-If choice is 6, terminate the program.
-Otherwise, display "Invalid choice!".
6.Display the result.
7.Repeat the process until the user chooses Exit.
8.Stop
PROGRAM:*/
import java.util.Scanner;
public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("\nChoose the operation you want to perform:");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    int add = x + y;
                    System.out.println("Result: " + add);
                    break;

                case 2:
                    int sub = x - y;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    int mod = x % y;
                    System.out.println("Result: " + mod);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
/*OUTPUT:
Enter the two numbers to perform operations

Enter the first number: 20
Enter the second number: 5

Choose the operation you want to perform:
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT

1
Result: 25*/
/*Result
Thus, the Java program to perform addition, subtraction, multiplication, division, and modulus using a menu-driven switch statement was successfully executed.*/
