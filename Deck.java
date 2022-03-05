import java.util.*;

public class Deck {
  public static final String c2 = "2♧";
  public static final String c3 = "3♧";
  public static final String c4 = "4♧";
  public static final String c5 = "5♧";
  public static final String c6 = "6♧";
  public static final String c7 = "7♧";
  public static final String c8 = "8♧";
  public static final String c9 = "9♧";
  public static final String c10 = "10♧";
  public static final String cJ = "Jack♧";
  public static final String cQ = "Queen♧";
  public static final String cK = "King♧";
  public static final String cA = "Ace♧";

  public static final String d2 = "2♢";
  public static final String d3 = "3♢";
  public static final String d4 = "4♢";
  public static final String d5 = "5♢";
  public static final String d6 = "6♢";
  public static final String d7 = "7♢";
  public static final String d8 = "8♢";
  public static final String d9 = "9♢";
  public static final String d10 = "10♢";
  public static final String dJ = "Jack♢";
  public static final String dQ = "Queen♢";
  public static final String dK = "King♢";
  public static final String dA = "Ace♢";

  public static final String h2 = "2♡";
  public static final String h3 = "3♡";
  public static final String h4 = "4♡";
  public static final String h5 = "5♡";
  public static final String h6 = "6♡";
  public static final String h7 = "7♡";
  public static final String h8 = "8♡";
  public static final String h9 = "9♡";
  public static final String h10 = "10♡";
  public static final String hJ = "Jack♡";
  public static final String hQ = "Queen♡";
  public static final String hK = "King♡";
  public static final String hA = "Ace♡";

  public static final String s2 = "2♤";
  public static final String s3 = "3♤";
  public static final String s4 = "4♤";
  public static final String s5 = "5♤";
  public static final String s6 = "6♤";
  public static final String s7 = "7♤";
  public static final String s8 = "8♤";
  public static final String s9 = "9♤";
  public static final String s10 = "10♤";
  public static final String sJ = "Jack♤";
  public static final String sQ = "Queen♤";
  public static final String sK = "King♤";
  public static final String sA = "Ace♤";

  // full deck of cards
  public static final ArrayList<String> FULL_DECK = new ArrayList<> ( 
    Arrays.asList(c2, c3, c4, c5, c6, c7, c8, c9, c10, cJ, cQ, cK, cA, d2, d3, d4, d5, d6, d7, d8, d9, d10, dJ, dQ, dK, dA, h2, h3, h4, h5, h6, h7, h8, h9, h10, hJ, hQ, hK, hA, s2, s3, s4, s5, s6, s7, s8, s9, s10, sJ, sQ, sK, sA)
  ); // ArrayList end

  // shuffles inputted list
  public static ArrayList<String> shuffle(ArrayList<String> deck) { 
    ArrayList<String> ret = new ArrayList<>();
    for (int j = 0; j < deck.size(); j++) {
      int rand = (int)(Math.random() * ret.size());
      ret.add(rand, deck.get(j));
    } // for end
    return ret;
  } // method end

  // deals a hand of x cards from deck
  public static void deal(ArrayList<String> hand, ArrayList<String> deck, int x) { 
    int pos = x-1;
    while (pos >= 0) {
      hand.add(deck.get(pos));
      deck.remove(pos);
      pos--;
    } // while end
  } // method end

} // Class end