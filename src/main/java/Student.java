package ie.atu;
import java.util.Scanner;

public class Student {
    String name;
    int idNumber;
    int age;
    String address;


    public Student(String name, int idNumber, int age, String address) {
        this.name = name;
        this.idNumber = idNumber;                   // Constructor for the class
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {                               //Displays the details of the instance of the class
        System.out.println("Name : " + name);
        System.out.println("Student ID : " + idNumber);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
}
