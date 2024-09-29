import java.util.*;

class PrintArrayInRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.print("Enter Array Size: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (i = 0; i < size; i++) {
			System.out.print("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		// reverse
		System.out.println("-----Reverse-----");
		for (i = a.length - 1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		sc.close();
	}
}