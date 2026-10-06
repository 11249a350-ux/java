/*A350
AIM:To write a Java program to find the largest of three numbers
using if-else statements.
ALGORITHM:
1. Start the program.
2. Declare three integer variables.
3. Get three numbers from the user.
4. Compare the first number with the second and third numbers.
5. If the first number is greater than both, display
   "First number is largest".
6. Otherwise, compare the second number with the first
   and third numbers.
7. If the second number is greater than both, display
   "Second number is largest".
8. Otherwise, compare the third number with the first
   and second numbers.
9. If the third number is greater than both, display
   "Third number is largest".
10. If the numbers are equal or not distinct, display
    "The numbers are not distinct or equal".
11. Stop the program.
PROGRAM:*/
import java.util.Scanner;
class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter three integers:");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest");
        } 
        else if (y > x && y > z) {
            System.out.println("Second number is largest");
        } 
        else if (z > x && z > y) {
            System.out.println("Third number is largest");
        } 
        else {
            System.out.println("The numbers are not distinct or equal");
        }
    }
}
/*OUTPUT:
Enter three integers:
10
25
15
Second number is largest
RESULT:Thus, the Java program to find the largest of three numbers
using if-else statements was successfully executed.*/
