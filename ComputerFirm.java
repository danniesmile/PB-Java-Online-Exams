package Others1;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalRate = 0;
        double totalSales = 0;

        for (int i = 1; i <= n; i++) {
            int comps = Integer.parseInt(scanner.nextLine());
            int rate = comps % 10;
            int sales = comps / 10;
            totalRate += rate;
            if (rate == 3) {
                totalSales += sales * 0.50;
            } else if (rate == 4) {
                totalSales += sales * 0.70;
            } else if (rate == 5) {
                totalSales += sales * 0.85;
            } else if (rate == 6) {
                totalSales += sales;
            }
        }

        double average = totalRate / n;
        System.out.printf("%.2f%n", totalSales);
        System.out.printf("%.2f", average);

    }
}