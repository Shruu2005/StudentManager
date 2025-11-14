import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = sc.nextLine();

        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student course: ");
        String course = sc.nextLine();

        Student student = new Student(name, age, course);

        System.out.println("\n--- Student Details ---");
        student.display();
    }
}
