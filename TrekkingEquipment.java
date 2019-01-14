package dpavlova;

import java.util.Scanner;

public class TrekkingEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alpinists = Integer.parseInt(scanner.nextLine());
        int carabiners = Integer.parseInt(scanner.nextLine());
        int ropes = Integer.parseInt(scanner.nextLine());
        int pickeys = Integer.parseInt(scanner.nextLine());

        double priceCarabiner, priceRope, pricePickey;
        priceCarabiner = 36;
        priceRope = 3.60;
        pricePickey = 19.80;


        double alpinistPriceCarabiners, alpinistPriceRopes, alpinistPricePickeys, pricePerAlpinist, totalAlpinistsSum, vatPrice;
        alpinistPriceCarabiners = carabiners * priceCarabiner;
        alpinistPriceRopes = ropes * priceRope;
        alpinistPricePickeys = pickeys * pricePickey;

        pricePerAlpinist = alpinistPriceCarabiners + alpinistPriceRopes + alpinistPricePickeys;
        totalAlpinistsSum = pricePerAlpinist * alpinists;

        vatPrice = totalAlpinistsSum + ((double) 20/100) * totalAlpinistsSum;

        System.out.printf("%.2f", vatPrice);

    }
}
