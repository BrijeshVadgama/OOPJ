import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount;
        System.out.print("Enter the number of students: ");
        studentCount = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 1; i <= studentCount; i++) {
            System.out.println("Enter details for Student " + i + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Process the student information
            System.out.println("Student " + i + " Details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Grade: " + grade);
        }

        scanner.close();
    }
}
