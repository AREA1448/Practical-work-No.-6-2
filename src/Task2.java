import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кутів багатокутника (n >= 3): ");
        int n = scanner.nextInt();

        if (n < 3) {
            System.out.println("Багатокутник повинен мати щонайменше 3 кути!");
            return;
        }

        double[] angles = new double[n];
        double sum = 0;

        System.out.println("Введіть " + n + " кутів (в градусах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Кут " + (i + 1) + ": ");
            angles[i] = scanner.nextDouble();
            sum += angles[i];
        }

        double expectedSum = 180 * (n - 2);

        System.out.println("\nСума кутів: " + sum + "°");
        System.out.println("Очікувана сума: " + expectedSum + "°");

        if (Math.abs(sum - expectedSum) < 0.001) {
            System.out.println("✓ Багатокутник може існувати.");
        } else {
            System.out.println("✗ Багатокутник з такими кутами НЕ може існувати.");
        }
    }
}