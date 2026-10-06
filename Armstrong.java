/*A350
AIM:
To write a simple Java program to check whether a given number is an Armstrong number or not.
ALGORITHM:
1.Start the program.
2.Get a positive number from the user.
3.Store the number in another variable.
4.Extract each digit using % 10.
5.Find the cube of each digit and add them.
6.Compare the sum with the original number.
7.If both are equal, print Armstrong Number.
8.Otherwise, print Not an Armstrong Number.
9.Stop the program.
PROGRAM: */
import java.util.Scanner; public class Armstrong
{
public static void main(String args[])
{
int n, nu, num=0, rem;
Scanner scan = new Scanner(System.in);

System.out.print("Enter any Positive Number : "); n = scan.nextInt();
nu = n; while(nu != 0)
{
rem = nu%10;
num = num + rem*rem*rem; nu = nu/10;
}
if(num == n)
{
System.out.print("Armstrong Number");
}
else
{
System.out.print("Not an Armstrong Number");
}
}
}
/*OUTPUT:
Enter any Positive Number : 153
Armstrong Number
Result:
Thus, the Java program to check whether the given number is an Armstrong number or not was successfully executed.*/



