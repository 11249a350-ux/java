/*A350
AIM:To write a Java program to find the sum, largest number,
and smallest number in an array.
ALGORITHM:
1. Start the program.
2. Declare and initialize an integer array.
3. Initialize sum as 0.
4. Set the first element as the minimum and maximum value.
5. Traverse through all the elements of the array.
6. If the current element is greater than the maximum,
   update the maximum value.
7. If the current element is smaller than the minimum,
   update the minimum value.
8. Add each element to the sum.
9. Display the sum, largest number, and smallest number.
10. Stop the program.
PROGRAM:*/
import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String args[])
    {
        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = 0;
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }

            if (a[i] < min)
            {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is: " + sum);
        System.out.println("Largest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
    }
}
/*OUTPUT:
The sum is: 357
Largest number in the array is: 90
Smallest number in the array is: 9
RESULT:Thus, the Java program to find the sum, largest number,
and smallest number in an array was successfully executed.*/
