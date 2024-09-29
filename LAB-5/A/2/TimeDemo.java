import java.util.Scanner;
class Time{ 
	int hour;
	int minute;
	int second;
	public Time (int hour, int minute, int second) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	void add (Time t) {
		this.second += t.second;
		if(this.second>=60) {
			this.minute++;
			this.second-=60;	
		}
		this.minute += t.minute;
		if(this.minute>=60) {
			this.hour++;
			this.minute-=60;
		}
		this.hour += t.hour;
	}
}
public class TimeDemo {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Hour: ");
		int h=sc.nextInt();
		System.out.print("Enter Minite: ");
		int m=sc.nextInt();
		System.out.print("Enter Second: ");
		int s=sc.nextInt();
		Time t1 = new Time (h,m,s);
		System.out.println("----- Enter h:m:s to Add -----");
		System.out.print("Enter Hour to Add: ");
		int h1=sc.nextInt();
		System.out.print("Enter Minite to Add: ");
		int m1=sc.nextInt();
		System.out.print("Enter Second to Add: ");
		int s1=sc.nextInt();
		Time t2 = new Time (h1,m1,s1);
		t1.add(t2);
		System.out.println("----- After Adding h:m:s Output is -----");
		System.out.println(t1.hour + ":" + t1.minute + ":" + t1.second);
		sc.close();
	}
}