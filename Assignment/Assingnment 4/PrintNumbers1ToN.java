import java.util.Scanner;

public class PrintNumbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}
