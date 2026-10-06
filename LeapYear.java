/*A350
AIM:To write a Java program to check whether a given year
is a leap year or not.
ALGORITHM:
1. Start the program.
2. Get the year from the user.
3. Check whether the year is divisible by 400.
4. If it is divisible by 400, the year is a leap year.
5. Otherwise, check whether the year is divisible by 100.
6. If it is divisible by 100, the year is not a leap year.
7. Otherwise, check whether the year is divisible by 4.
8. If it is divisible by 4, the year is a leap year.
9. Otherwise, the year is not a leap year.
10. Display the result.
11. Stop the program.
PROGRAM:*/
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        // Check leap year condition
        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        // Output result
        if (flag) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

        s.close();
    }
}
/*OUTPUT:
Enter any year: 2024
Year 2024 is a leap year
RESULT:Thus, the Java program to check whether a given year
is a leap year or not was successfully executed.*/
