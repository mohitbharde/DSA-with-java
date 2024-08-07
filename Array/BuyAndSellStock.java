
public class BuyAndSellStock {

    public static int profit(int price[]) {
        int buyPrice = Integer.MAX_VALUE;

        int maxProfit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice > price[i]) {
                buyPrice = price[i];
            }
            if ((price[i] - buyPrice) > maxProfit) {
                maxProfit = price[i] - buyPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println("Maximum Profit is " + profit(price));

    }
}
