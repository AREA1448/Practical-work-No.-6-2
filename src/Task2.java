import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of corners of the polygon (n >= 3): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("A polygon must have at least 3 corners!");
            return;
        }

        double[] angles = new double[n];
        double sum = 0;

        System.out.println("Enter " + n + " corners (in degrees):");
        for (int i = 0; i < n; i++) {
            System.out.print("Angle " + (i + 1) + ": ");
            angles[i] = scanner.nextDouble();
            sum += angles[i];
        }

        double expectedSum = 180 * (n - 2);

        System.out.println("\nSum of angles: " + sum + "°");
        System.out.println("expected amount: " + expectedSum + "°");

        if (Math.abs(sum - expectedSum) < 0.001) {
            System.out.println("✓ A polygon can exist.");
        } else {
            System.out.println("✗ A polygon with such angles cannot exist.");
        }
    }
}
