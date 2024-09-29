import java.util.*;

class PrimeNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2: ");
		int n2 = sc.nextInt();
		int i, j;
		boolean f = false;
		for (i = n1; i <= n2; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					f = true;
					break;
				} else {
					f = false;
				}
			}
			if (f == false) {
				System.out.println(i);
			}
		}
	}
}