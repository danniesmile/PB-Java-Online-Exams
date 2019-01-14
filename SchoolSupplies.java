package dpavlova;

import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double literDetergent = Double.parseDouble(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double pensPrice, markersPrice, detergentPricePerLiter;
        pensPrice = 5.80;
        markersPrice = 7.20;
        detergentPricePerLiter = 1.20;

        double totalPensPrice, totalMarkersPrice, totalDetergentPrice;
        totalPensPrice = pens * pensPrice;
        totalMarkersPrice = markers * markersPrice;
        totalDetergentPrice = literDetergent * detergentPricePerLiter;

        double totalSum = totalPensPrice + totalMarkersPrice + totalDetergentPrice;
        double totalDiscounted = totalSum - ((totalSum * percentDiscount / 100));

        System.out.printf("%.3f", totalDiscounted);
    }
}
