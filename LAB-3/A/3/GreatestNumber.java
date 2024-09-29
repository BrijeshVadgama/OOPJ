import java.util.*;
class GreatestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int no1 = sc.nextInt();
        System.out.print("Enter Number 2: ");
		int no2 = sc.nextInt();
        System.out.print("Enter Number 3: ");
		int no3 = sc.nextInt();
        if(no1>no2) {
            if(no1>no3) {
                System.out.println(no1+" is Greater");
            } else {
                System.out.println(no3+" is Greater");
            }
        } else { 
            if(no2>no3) {
                System.out.println(no2+" is Greater");
            } else {
                System.out.println(no3+" is Greater");
            }
        }
    }
}