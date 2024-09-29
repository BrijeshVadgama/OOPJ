import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > 5 - i; j--) {
                System.out.print(" " + j);
            }
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" " + (5 - i + 1));
            }
            System.out.println();
        }
    }
}
