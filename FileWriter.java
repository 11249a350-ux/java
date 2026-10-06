/*A350
AIM:To write a Java program to create a file and write
the alphabet letters from A to Z into the file.
ALGORITHM:
1. Start the program.
2. Create a FileWriter object for the file "sample2.txt".
3. Use a loop to generate characters from A to Z.
4. Write each character into the file.
5. Close the file.
6. If an exception occurs, display the exception message.
7. Stop the program.
PROGRAM:*/
import java.io.*;
class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}
/*OUTPUT:
The file "sample2.txt" is created successfully.
Contents of sample2.txt:
ABCDEFGHIJKLMNOPQRSTUVWXYZ
RESULT:Thus, the Java program to create a file and write the
alphabet letters from A to Z was successfully executed.*/
