import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RealStockPriceTracker {
  // You should complete StockPriceTracker first.
  
  // In RealStockPriceTracker, we should consider the stock price is by Stock Code & Trade date
  // For example, the stock price of GOOGL on 13 Jan is $191.01

  // Tips: You should still use PriorityQueue, HashMap, Deque

  // Complete getHighestPrice(String stockCode) and getLatestPrice(String stockCode)

  private final List<Stock> stocks = new ArrayList<>();

  public RealStockPriceTracker(){
  }

  public void addStock(Stock stockCode){
    this.stocks.add(stockCode);
  }

  public void addRecord(StockCode stockCode, LocalDate date, double price){
    for (Stock stock : this.stocks){
      if (stock.getStockCode() == stockCode)
      stock.addRecords(date, price);
    }
  }

  public double getHighestPrice(StockCode stockCode){
    double highest = 0.0;
    for (Stock stock : this.stocks){
      if (stock.getStockCode() == stockCode)
        highest = stock.getHighestPrice();
    }
    return highest;
  }

  public double getLatestPrice(StockCode stockCode){
    double latest = 0.0;
    for (Stock stock : this.stocks){
      if (stock.getStockCode() == stockCode)
      latest = stock.getLatestPrice();
    }
    return latest;
  } 

  public static void main(String[] args) {
    RealStockPriceTracker tracker = new RealStockPriceTracker();

    // code here ... for testing
    Stock s1 = new Stock(StockCode.GOOGL);
    Stock s2 = new Stock(StockCode.NVIDIA);
    Stock s3 = new Stock(StockCode.MSFT);
    tracker.addStock(s1);
    tracker.addStock(s2);
    tracker.addStock(s3);

    tracker.addRecord(StockCode.GOOGL, LocalDate.of(2025, 1, 13), 191.01);
    tracker.addRecord(StockCode.GOOGL, LocalDate.of(2025, 1, 14), 180.01);
    tracker.addRecord(StockCode.GOOGL, LocalDate.of(2025, 1, 15), 195.01);

    tracker.addRecord(StockCode.NVIDIA, LocalDate.of(2025, 1, 13), 170.01);
    tracker.addRecord(StockCode.NVIDIA, LocalDate.of(2025, 1, 14), 165.01);
    tracker.addRecord(StockCode.NVIDIA, LocalDate.of(2025, 1, 15), 189.01);

    tracker.addRecord(StockCode.MSFT, LocalDate.of(2025, 1, 13), 170.01);
    tracker.addRecord(StockCode.MSFT, LocalDate.of(2025, 1, 14), 130.01);
    tracker.addRecord(StockCode.MSFT, LocalDate.of(2025, 1, 15), 150.01);

    System.out.println(tracker.getHighestPrice(StockCode.NVIDIA)); // 189.01
    System.out.println(tracker.getLatestPrice(StockCode.GOOGL)); // 195.01

    
  }

}
