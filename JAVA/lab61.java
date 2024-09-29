// import java.util.Scanner;

// class Student {
//     int id_no;
//     int no_of_subjects_registered;
//     int[] subject_code;
//     int[] subject_credits;
//     char[] grade_obtained;
//     double spi;

//     public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits,
//             char[] grade_obtained) {
//         this.id_no = id_no;
//         this.no_of_subjects_registered = no_of_subjects_registered;
//         this.subject_code = subject_code;
//         this.subject_credits = subject_credits;
//         this.grade_obtained = grade_obtained;
//         this.spi = calculateSPI();
//     }

//     double calculateSPI() {
//         double totalGradePoints = 0;
//         int totalCredits = 0;

//         for (int i = 0; i < no_of_subjects_registered; i++) {
//             if (grade_obtained[i] == 'A') {
//                 totalGradePoints = (10 * subject_credits[i]) + totalGradePoints;
//             } else if (grade_obtained[i] == 'B') {
//                 totalGradePoints += 8 * subject_credits[i];
//             } else if (grade_obtained[i] == 'C') {
//                 totalGradePoints += 6 * subject_credits[i];
//             } else if (grade_obtained[i] == 'D') {
//                 totalGradePoints += 4 * subject_credits[i];
//             } else if (grade_obtained[i] == 'F') {
//                 totalGradePoints += 0;
//             }

//             totalCredits += subject_credits[i];
//         }

//         if (totalCredits == 0) {
//             return 0.0;
//         }

//         return totalGradePoints / totalCredits;
//     }

//     public void displayStudentInfo() {
//         System.out.println("Student ID////SPI:  ");
//         System.out.println(+id_no + spi);
//     }
// }

// public class lab61 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the number of students: ");
//         int n = scanner.nextInt();

//         Student[] students = new Student[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter student ID: ");
//             int id = scanner.nextInt();

//             System.out.print("Enter the number of subjects registered: ");
//             int numSubjects = scanner.nextInt();

//             int[] subjectCodes = new int[numSubjects];
//             int[] subjectCredits = new int[numSubjects];
//             char[] grades = new char[numSubjects];

//             for (int j = 0; j < numSubjects; j++) {
//                 System.out.print("Enter subject code for subject " + (j + 1) + ": ");
//                 subjectCodes[j] = scanner.nextInt();
//                 System.out.print("Enter subject credits for subject " + (j + 1) + ": ");
//                 subjectCredits[j] = scanner.nextInt();
//                 System.out.print("Enter grade obtained for subject " + (j + 1) + " (A/B/C/D/F): ");
//                 grades[j] = scanner.next().charAt(0);
//             }

//             students[i] = new Student(id, numSubjects, subjectCodes, subjectCredits, grades);

//             for (Student student : students) {
//                 student.displayStudentInfo();
//             }
//         }

//         scanner.close();
//     }
// }

import java.util.Scanner;

class Student {
    private int id_no;
    private int no_of_subjects_registered;
    private int[] subject_code;
    private int[] subject_credits;
    private int[] grade_obtained;
    private double spi;

    public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits,
            int[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0; // SPI is initially set to 0, it will be calculated later.
    }

    public void calculateSPI() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];
            totalGradePoints += grade_obtained[i] * subject_credits[i];
        }

        spi = totalGradePoints / totalCredits;
    }

    public void displayDetails() {
        System.out.println("ID: " + id_no);
        System.out.println("SPI: " + spi);
    }
}

public class lab61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("ID Number: ");
            int id_no = scanner.nextInt();
            System.out.print("Number of subjects registered: ");
            int no_of_subjects_registered = scanner.nextInt();

            int[] subject_code = new int[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            int[] grade_obtained = new int[no_of_subjects_registered];

            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.println("Enter details for Subject " + (j + 1));
                System.out.print("Subject Code: ");
                subject_code[j] = scanner.nextInt();
                System.out.print("Subject Credits: ");
                subject_credits[j] = scanner.nextInt();
                System.out.print("Grade Obtained (in integer): ");
                grade_obtained[j] = scanner.nextInt();
            }

            students[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
        }

        // Calculate SPI for each student and display their details
        for (Student student : students) {
            student.calculateSPI();
            student.displayDetails();
            System.out.println();
        }

        scanner.close();
    }
}
