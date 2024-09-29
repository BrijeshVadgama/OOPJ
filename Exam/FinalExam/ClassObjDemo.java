// 2022_Q2_B(2) : Write a program to Display Employee details(emp_name, emp_salary,emp_designation) using class & objects.

import java.util.Scanner;

class emp_details {
    Scanner sc = new Scanner(System.in);
    String emp_name, emp_designation;
    float emp_salary;

    public void getEmpDetails() {
        System.out.print("Enter Employee Name:: ");
        emp_name = sc.nextLine();
        System.out.print("Enter Employee Salary:: ");
        emp_salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter Employee Designation:: ");
        emp_designation = sc.nextLine();
    }

    public void showEmpDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("Employee Name is:: " + emp_name);
        System.out.println("Employee Salary is:: " + emp_salary);
        System.out.println("Employee Designation is:: " + emp_designation);
    }
}

public class ClassObjDemo {
    public static void main(String[] args) {
        emp_details ed = new emp_details();
        ed.getEmpDetails();
        ed.showEmpDetails();
    }
}
