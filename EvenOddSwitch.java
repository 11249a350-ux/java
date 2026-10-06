/*A350
AIM:To write a Java program to check whether a given number
is even or odd using switch statement.
ALGORITHM:
1. Start the program.
2. Get a number from the user.
3. Find the remainder by dividing the number by 2.
4. Use the switch statement with the remainder.
5. If the remainder is 0, display "This number is even".
6. If the remainder is 1, display "This number is odd".
7. Display the result.
8. Stop the program.
PROGRAM*/
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {

            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;

            default:
                System.out.println("Invalid input");
        }
    }
}
/*OUTPUT:
Enter a number: 10
This number is even
RESULT:Thus, the Java program to check whether the given number
is even or odd using switch statement was successfully executed.*/
