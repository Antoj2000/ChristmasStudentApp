package ie.atu;
import java.util.Scanner;

public class Student {
    String name;
    int idNumber;
    int age;
    String address;

    public Student() {
        this.name = "";
        this.idNumber = 0;                   // Constructor for the class
        this.age = 0;
        this.address = "";
    }

    public Student(String name, int idNumber, int age, String address) {
        this.name = name;
        this.idNumber = idNumber;                   // Constructor for the class
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {                               //Displays the details of the instance of the class
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Student ID : " + idNumber);
        System.out.println("Age : " + age);

    }

    public void getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name : ");
        this.name = scanner.nextLine();

        System.out.print("Enter address : ");
        this.address = scanner.nextLine();

        System.out.print("Enter Student ID : ");
        this.idNumber = scanner.nextInt();

        System.out.print("Enter age : ");
        this.age = scanner.nextInt();

    }
}
