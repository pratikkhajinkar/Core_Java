import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int N = sc.nextInt();
        int sumLoop = 0;
        for (int i = 1; i <= N; i++) {
            sumLoop += i;
        }
        int sumFormula = N * (N + 1) / 2;
        System.out.println("Sum of first " + N + " numbers using loop = " + sumLoop);
        System.out.println("Sum of first " + N + " numbers without loop = " + sumFormula);

        sc.close();
    }
}
