/*A350
AIM:
To write a Java program to demonstrate thread creation
and thread priorities using multiple threads.
ALGORITHM:
1. Start the program.
2. Create three thread classes A, B and C by extending
   the Thread class.
3. Define the run() method in each thread class.
4. Create objects for Thread A, Thread B and Thread C.
5. Set the priority of Thread C to maximum priority.
6. Set the priority of Thread B to one more than the
   priority of Thread A.
7. Set the priority of Thread A to minimum priority.
8. Start Thread A.
9. Start Thread B.
10. Start Thread C.
11. Each thread executes its run() method and displays
    its respective messages.
12. Display the end of the main thread.
13. Stop 
PROGRAM:*/
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}
/*OUTPUT:
start thread A
start thread B
start thread C
end of main thread
Thread A started
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
Thread B started
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread C started
thread c =1
thread c =2
thread c =3
thread c =4
exit from c
RESULT:Thus, the Java program to demonstrate thread creation
and thread priorities was successfully executed.*/
