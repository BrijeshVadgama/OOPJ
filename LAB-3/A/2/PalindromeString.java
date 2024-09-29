import java.util.*;
class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();
        int i=0, j=s.length()-1, flag=0;
        while(i<j && flag==0) {
            if(s.charAt(i)!=s.charAt(j)) {
                flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag==0) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is Not Palindrome");
        }
        sc.close();
    }
}