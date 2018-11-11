package pavlova;

import java.util.Scanner;

public class SeaTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyForFood = Double.parseDouble(scanner.nextLine());
        double moneyForSouvenirs = Double.parseDouble(scanner.nextLine());
        double moneyForHotel = Double.parseDouble(scanner.nextLine());

        double tripKilometres = 420;
        double totalBenzinLitres = tripKilometres / 100 * 7;
        double totalMoneyForBenzin = totalBenzinLitres * 1.85;
        double totalMoneyForFoodAndSouvenirs = (3 * moneyForFood) + (3 * moneyForSouvenirs);

        double firstDay = moneyForHotel * 0.90;
        double secondDay = moneyForHotel * 0.85;
        double thirdDay = moneyForHotel * 0.80;

        double totalSum = totalMoneyForBenzin + firstDay + totalMoneyForFoodAndSouvenirs + secondDay + thirdDay;

        System.out.printf("Money needed: %.2f", totalSum);
    }
}
