import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
  // 52 cards
  private Card[] cards;

  public Deck(){    
    this.cards = new Card[Card.SUITES.length * Card.RANKS.length];
    int idx = 0;
    for (int i = 0; i < Card.SUITES.length; i++){
      for (int j = 0; j < Card.RANKS.length; j++){
        this.cards[idx++] = new Card(Card.RANKS[j], Card.SUITES[i]);
      } 
    }
  }

  public List<Card> getCards(){
    return new ArrayList<>(Arrays.asList(this.cards));
  }

  public Card getCard(int i){
    return this.cards[i];
  }

  public char showCard(int i){
    return this.cards[i].getSuite();
  }


  public static void main(String[] args) {
    Deck deck = new Deck(); // 52 cards
    System.out.println(Math.PI); // public and static
    System.out.println(deck.showCard(5));
    
    
    for (Card card : deck.cards){
      System.out.println(card.getSuite() + " " + card.getRank());
    }
  }
}
