/*A350
AIM:To write a Java program to demonstrate different types of
inheritance such as Single Inheritance, Multilevel Inheritance,
Hierarchical Inheritance, Multiple Inheritance and
Hybrid Inheritance.
ALGORITHM:
1. Start the program.
2. Create an Animal class with an eat() method.
3. Create a Dog class that inherits from Animal and
   define the bark() method.
4. Create a Puppy class that inherits from Dog and
   define the play() method.
5. Create a Cat class that inherits from Animal and
   define the meow() method.
6. Create Father and Mother interfaces with their methods.
7. Create a Child class that implements both Father and
   Mother interfaces.
8. Create a Sports interface with the playSports() method.
9. Create a Student class with the study() method.
10. Create a CollegeStudent class that inherits from Student
    and implements the Sports interface.
11. Create objects for the different classes.
12. Call the methods to demonstrate the different types
    of inheritance.
13. Display the results.
14. Stop the program.
PROGRAM:*/
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}
class Student {
    void study() {
        System.out.println("Student studies");
    }
}
class CollegeStudent extends Student implements Sports {
    public void playSports() {
        System.out.println("College student plays sports");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println("\nMultiple Inheritance:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}
/*OUTPUT:
Single Inheritance:
Animal eats
Dog barks
Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays
Hierarchical Inheritance:
Animal eats
Cat meows
Multiple Inheritance:
Child gets property from Father
Child gets property from Mother
Hybrid Inheritance:
Student studies
College student plays sports
RESULT:
Thus, the Java program to demonstrate Single, Multilevel,
Hierarchical, Multiple and Hybrid Inheritance was
successfully executed.*/
