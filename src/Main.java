import java.util.Scanner;

// Main class to run Stock Trading Platform
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TradingPlatform platform = new TradingPlatform();
        Portfolio portfolio = new Portfolio();

        while (true) {
            System.out.println("\n1. View Market");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    platform.showMarket();
                    break;

                case 2:
                    platform.showMarket();
                    System.out.print("Enter stock index to buy: ");
                    int buyIndex = sc.nextInt();
                    portfolio.buyStock(platform.marketStocks.get(buyIndex));
                    break;

                case 3:
                    portfolio.viewPortfolio();
                    System.out.print("Enter stock index to sell: ");
                    int sellIndex = sc.nextInt();
                    portfolio.sellStock(sellIndex);
                    break;

                case 4:
                    portfolio.viewPortfolio();
                    break;

                case 5:
                    System.out.println("Thank you for trading!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
