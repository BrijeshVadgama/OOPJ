import java.util.*;

class AvgUsingArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, sum = 0;
		System.out.print("Enter Array Size: ");
		int size = sc.nextInt();

		// dynamic
		int a[] = new int[size];
		for (i = 0; i < size; i++) {
			System.out.print("Enter a[" + i + "]: ");
			a[i] = sc.nextInt();
		}
		for (i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("Avg is: " + (sum / size));
		sc.close();

		// static
		// int a1[]=new int[4];
		// for(i=0;i<4;i++){
		// System.out.print("Enter a["+i+"]: ");
		// a1[i]=sc.nextInt();
		// }
		// for(i=0;i<a1.length;i++){
		// sum+=a1[i];
		// }
		// System.out.println("Avg is: "+(sum/4));
	}
}