package ie.atu;
import ie.atu.Student;
import java.io.File;
import java.io.IOException;



public class Main {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.getUserInput();
        student1.displayInfo();
        student1.getFileName();
        student1.createFile();

    }
}