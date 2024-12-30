import java.util.Arrays;

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

  public Card[] getCards(){
    return this.cards;
  }

  public Card getCard(int i){
    return this.cards[i];
  }

  public char[] showCard(int i){
    char[] showCard = new char[]{this.cards[i].getSuite(), this.cards[i].getRank()};
    return showCard;
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
