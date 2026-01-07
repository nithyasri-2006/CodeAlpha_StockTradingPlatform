import java.util.ArrayList;

// Portfolio class manages user's stocks
public class Portfolio {

    ArrayList<Stock> stocks = new ArrayList<>();
    double balance = 10000; // starting balance

    void buyStock(Stock stock) {
        if (balance >= stock.price) {
            stocks.add(stock);
            balance -= stock.price;
            System.out.println("Stock bought successfully!");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void sellStock(int index) {
        if (index >= 0 && index < stocks.size()) {
            Stock s = stocks.remove(index);
            balance += s.price;
            System.out.println("Stock sold successfully!");
        } else {
            System.out.println("Invalid stock index!");
        }
    }

    void viewPortfolio() {
        System.out.println("\nYour Portfolio:");
        for (int i = 0; i < stocks.size(); i++) {
            System.out.println(i + ". " + stocks.get(i).symbol + " - $" + stocks.get(i).price);
        }
        System.out.println("Balance: $" + balance);
    }
}
