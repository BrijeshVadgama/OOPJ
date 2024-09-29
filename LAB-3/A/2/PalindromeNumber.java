import java.util.*;
class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int rev=0,temp=n;
        while(n>0) {
            rev = (rev*10)+n%10;
            n = n/10;
        }
        if(rev==temp) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is Not Palindrome");
        }
        sc.close();
    }
}