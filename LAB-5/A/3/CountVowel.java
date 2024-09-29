import java.util.Scanner;

class Vowel {
    void VowelCount(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        str=str.toLowerCase();
        int i,aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
        for(i=0;i<str.length();i++) {
            if(str.equals("quit")) {
                break;
            } else {
                if(str.charAt(i)=='a') {
                    aCount++;
                }
                if(str.charAt(i)=='e') {
                    eCount++;
                }
                if(str.charAt(i)=='i') {
                    iCount++;
                }
                if(str.charAt(i)=='o') {
                    oCount++;
                }
                if(str.charAt(i)=='u') {
                    uCount++;
                }
            }
        }
        if(str.equals("quit")) {
            System.out.println("You Quit The Program..");
        } else {
            System.out.println("Count of a is: "+aCount);
            System.out.println("Count of e is: "+eCount);
            System.out.println("Count of i is: "+iCount);
            System.out.println("Count of o is: "+oCount);
            System.out.println("Count of u is: "+uCount);
        }
        sc.close();
    }
}

public class CountVowel {
    public static void main(String[] args) {
        Vowel v=new Vowel();
        v.VowelCount();
    }    
}
