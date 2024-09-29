import java.util.Scanner;

class Complex {
    int real,imaginary;
    public Complex(int real,int imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }
    public void Show() {
        System.out.println("");   
    }
    public void Sum(Complex c1,Complex c2) {
        real = c1.real + c2.real;
        imaginary = c1.imaginary + c2.imaginary;
        System.out.println("---------- Sum ----------");
        System.out.println("Sum of Real Number is: "+real);
        System.out.println("Sum of Imaginary Number is: "+imaginary+"i");
    }
}
public class AddComplexNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value Of c1(1): ");
        int no1 = sc.nextInt();
        System.out.print("Enter value Of c1(2)i: ");
        int no2 = sc.nextInt();
        Complex c1 = new Complex(no1, no2);
        System.out.print("Enter value Of c2(1): ");
        int no3 = sc.nextInt();
        System.out.print("Enter value Of c2(2)i: ");
        int no4 = sc.nextInt();
        Complex c2 = new Complex(no3, no4);
        c1.Sum(c1,c2);   
        sc.close();
    }    
}