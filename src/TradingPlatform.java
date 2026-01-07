import java.util.ArrayList;

// TradingPlatform class controls market data
public class TradingPlatform {

    ArrayList<Stock> marketStocks = new ArrayList<>();

    TradingPlatform() {
        marketStocks.add(new Stock("AAPL", 150));
        marketStocks.add(new Stock("GOOG", 2800));
        marketStocks.add(new Stock("TSLA", 700));
    }

    void showMarket() {
        System.out.println("\nAvailable Stocks:");
        for (int i = 0; i < marketStocks.size(); i++) {
            System.out.println(i + ". " + marketStocks.get(i).symbol + " - $" + marketStocks.get(i).price);
        }
    }
}
