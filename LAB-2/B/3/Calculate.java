import java.util.*;
class Calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		float no1 = sc.nextFloat();
		System.out.print("Enter Number 2: ");
		float no2 = sc.nextFloat();
		System.out.println("Addition: "+(no1+no2));
		System.out.println("Subtraction: "+(no1-no2));
		System.out.println("Multiplication: "+(no1*no2));
		System.out.println("Division: "+(no1/no2));
		System.out.println("Modulo: "+(no1%no2));
		sc.close();
	}
}