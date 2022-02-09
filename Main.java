import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<String> test = new ArrayList<>();
    test.add(Deck.cJ);
    test.add(Deck.sA);
    test.add(Deck.s7);
    test.add(Deck.h5);
    test.add(Deck.d9);
    System.out.println(test);
    double g = Evaluate.eval(test);
    System.out.println(g);
  } // method end
} // Class end