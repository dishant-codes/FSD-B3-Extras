import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        char grade;

        System.out.println("Enter Student Name :");
        name = scan.nextLine();

        System.out.println("Enter Age :");
        age = scan.nextInt();

        System.out.println("Enter Grade :");
        grade = scan.next().charAt(0);


        System.out.println("Student Information");
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
        System.out.println("Grade :"+grade);


    }
}
