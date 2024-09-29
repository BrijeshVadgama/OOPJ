import java.util.*;
class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[5];
		int i,total=0,per,f=0;

		for(i=0;i<marks.length;i++) {
            System.out.print("Enter Subject "+(i+1)+" Marks : ");
			marks[i] = sc.nextInt();
			total+=marks[i];
			if(marks[i]<0){
				f=1;
				break;
			}
		}
		if(f==0) {
		per = total/5;
		System.out.println("Total is: "+total);
		System.out.println("Percentage is: "+per);
		if(per>=60) {
			System.out.println("First Division");
		} else if(per>=50 && per<=59) {
			System.out.println("Second Division");
		} else if(per>=40 && per<=49) {
			System.out.println("Third Division");
		} else if(per<40) {
			System.out.println("Fail");
		}
	}
		sc.close();
	}
}