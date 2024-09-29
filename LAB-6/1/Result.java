import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credit;
    int[] grade_obtained;
    double spi, total_weight;
    int total_credit;

    public Student(int id_no, int no_of_subjects_registered, int subject_code[], int subject_credit[],
            int grade_obtained[]) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credit = subject_credit;
        this.grade_obtained = grade_obtained;
    }

    void Calculate_spi() {
        for (int i = 0; i < no_of_subjects_registered; i++) {
            total_weight += grade_obtained[i] * subject_credit[i];
            total_credit += subject_credit[i];
        }
        spi = total_weight / total_credit;
        System.out.println(id_no + "\t\t\t " + spi);
    }
}

public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sid, sub;

        // System.out.print("Enter no of Students : ");
        // int n = sc.nextInt();

        int n = Integer.parseInt(args[0]);

        Student[] student = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("--------------------------------");
            System.out.println("Enter details for Student :: " + (i + 1));
            System.out.println("--------------------------------");
            System.out.print("Enter Student Id : ");
            sid = sc.nextInt();

            System.out.print("Enter no of Subjects : ");
            sub = sc.nextInt();

            int[] grade = new int[sub];
            int[] credit = new int[sub];
            int[] code = new int[sub];

            for (int j = 0; j < sub; j++) {
                System.out.println("--------------------------------");
                System.out.println("Enter details for Subject :: " + (j + 1));
                System.out.println("--------------------------------");
                System.out.print("Enter Subject Code : ");
                code[j] = sc.nextInt();
                System.out.print("Enter Subject Credit : ");
                credit[j] = sc.nextInt();
                System.out.print("Enter Subject Grade : ");
                grade[j] = sc.nextInt();
            }

            student[i] = new Student(sid, sub, code, credit, grade);
        }

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("Student ID \t\t SPI ");
        System.out.println("----------------------------------------------");

        for (Student s : student) {
            s.Calculate_spi();
        }
        sc.close();
    }
}