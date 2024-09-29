import java.util.*;
class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fahrenheit: ");
		float f = sc.nextFloat();
		System.out.println("Fahrenheit To Celsius: "+(f-32*5/9));

		System.out.print("Enter Celsius: ");
		float c = sc.nextFloat();
		System.out.println("Celsius To Fahrenheit: "+(c-32*5/9));
		
		sc.close();
	}
}