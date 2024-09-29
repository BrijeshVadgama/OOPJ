import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k;
        System.out.print("Enter Value: ");
        int s = sc.nextInt();
        System.out.print("Enter Character: ");
        char c=sc.next().charAt(0);
        for(i=1;i<=s;i++) {
        	for(k=1;k<=s-i;k++){
        		System.out.print(" ");
        	}
        	for(j=1;j<=i;j++){
        		System.out.print(" "+c);
        	}
        	System.out.println();
        }
        for(i=s;i>=1;i--) {
        	for(k=s-i;k>=1;k--){
        		System.out.print(" ");
        	}
        	for(j=i;j>=1;j--){
        		System.out.print(" "+c);
        	}
        	System.out.println();
        }
    }
}