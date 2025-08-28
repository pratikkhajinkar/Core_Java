import java.util.Scanner;

public class SumFromXtoY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number (x): ");
        int x = sc.nextInt();

        System.out.print("Enter ending number (y): ");
        int y = sc.nextInt();
        int sumLoop = 0;
        for (int i = x; i <= y; i++) {
            sumLoop += i;
        }
        int sumFormula = (y * (y + 1) / 2) - ((x - 1) * x / 2);
        System.out.println("Sum from " + x + " to " + y + " using loop = " + sumLoop);
        System.out.println("Sum from " + x + " to " + y + " without loop = " + sumFormula);

        sc.close();
    }
}
