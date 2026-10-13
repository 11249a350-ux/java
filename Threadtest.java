/* A350
AIM: To demonstrate multithreading in Java using yield(), sleep(), and thread priorities.
ALGORITHM:
1.Create three classes A, B, and C by extending the Thread class.
2.Override the run() method in each class.
3.Use Thread.yield() in thread A to allow other threads to execute.
4.Use Thread.sleep(1500) in thread C to pause execution for 1.5 seconds.
5.Use break in thread B to stop the loop when j == 3.
6.Set different priorities for threads A, B, and C using setPriority().
7.Create objects for all three threads.
8.Start the threads using the start() method.
9.Observe the output of the threads.
PROGRAM: */
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}import java.io.*;
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
 Start thread A
 start thread B
 start thread C
 end of main thread
 Thread A started
 Thread B started
 thread C started
 from thread A i=1
 from thread B j=1
 thread c =1
 from thread A i=2
 from thread B j=2
 thread c =2
 from thread A i=3
 from thread B j=3
 thread c =3
 from thread A i=4
 from thread B j=4
 thread c =4
 exit from A
 exit from B
 exit from c
 RESULT:Thus, multithreading and thread priorities in Java
 were demonstrated successfully.*/

