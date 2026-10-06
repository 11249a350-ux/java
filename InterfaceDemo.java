/*A350
AIM:To write a Java program to demonstrate the use of an
interface using the Animal and Dog classes.
ALGORITHM:
1. Start the program.
2. Create an interface named Animal with a sound() method.
3. Create a Dog class that implements the Animal interface.
4. Define the sound() method in the Dog class.
5. Create an object of the Dog class.
6. Call the sound() method using the Dog object.
7. Display "Dog Barks".
8. Stop the program.
    PROGRAM:*/
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
/*OUTPUT:
Dog Barks
RESULT:Thus, the Java program to demonstrate the use of an
interface was successfully executed.*/
