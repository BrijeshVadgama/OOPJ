import java.util.*;

class print_second_half {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		int half = s.length() / 2;
		// System.out.println("String Length is: "+half);
		System.out.println("String Length is: " + s.substring(half));
		sc.close();
	}
}