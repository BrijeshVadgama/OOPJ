import java.util.*;

class CountOfVowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		int i, vCount = 0, cCount = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else {
				cCount++;
			}
			sc.close();
		}
		System.out.println("Count Of Vowel is: " + vCount);
		System.out.println("Count of Consonant is: " + cCount);
	}
}