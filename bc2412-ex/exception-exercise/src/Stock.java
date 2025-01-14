import java.time.LocalDate;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Stock {
  private StockCode stockcode;
  private final HashMap<LocalDate, Double> dailyRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();
  Comparator<Double> maxPrice = new GetHighestPrice();
  private final Queue<Double> getHighestPriceQ = new PriorityQueue<>(maxPrice);

  public Stock(StockCode stockCode){
    this.stockcode = stockCode;
  }

  public StockCode  getStockCode(){
    return this.stockcode;
  }

  public void addRecords(LocalDate date, double price){
    this.dailyRecords.put(date, price);
    this.tradeDates.add(date);
    this.getHighestPriceQ.add(price);
  }

  public double getPriceByDate(LocalDate date){
    return this.dailyRecords.get(date);
  }

  public double getHighestPrice(){
    return this.getHighestPriceQ.poll();
  }

  public double getLatestPrice(){
    return this.dailyRecords.get(this.tradeDates.getLast());
  }
}
