/*A350
AIM:To write a Java program to read the contents of a file
using FileReader.
ALGORITHM:
1. Start the program.
2. Create a FileReader object to open the file "sample2.txt".
3. Read the file character by character.
4. Check whether the end of the file is reached.
5. Display each character read from the file.
6. Close the file.
7. If an exception occurs, display the exception message.
8. Stop the program.
PROGRAM:*/
import java.io.*; class Filereader
{
public static void main(String[]args)
{
try
{
FileReader fr=new FileReader("sample2.txt"); int i;
while((i=fr.read())!=-1)
{
System.out.println((char)i);
}
fr.close();
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}
/*OUTPUT:
A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z
RESULT:Thus, the Java program to read the contents of a file
using FileReader was successfully executed.*/
