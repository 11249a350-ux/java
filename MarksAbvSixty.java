/*A350
AIM:To write a Java program to read the names and marks of
students and display the students who scored more than 60 marks.
ALGORITHM:
1. Start the program.
2. Declare arrays to store the names and marks of 6 students.
3. Get the name and marks of each student from the user.
4. Store the names and marks in the respective arrays.
5. Traverse through the marks array.
6. Check whether each student's marks are greater than 60.
7. If the marks are greater than 60, display the student's
   name and marks.
8. Stop the program.
PROGRAM:*/
import java.util.Scanner;

public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;

        Scanner scanner = new Scanner(System.in);

        // Input
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output (marks > 60)
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
/*OUTPUT:
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Ravi 55
Enter Name of Student and Marks of Subject 3: Kumar 82
Enter Name of Student and Marks of Subject 4: Priya 60
Enter Name of Student and Marks of Subject 5: Anu 91
Enter Name of Student and Marks of Subject 6: Siva 48
Students scoring more than 60:
Arun : 75
Kumar : 82
Anu : 91
RESULT:Thus, the Java program to display the students who scored
more than 60 marks was successfully executed.*/
