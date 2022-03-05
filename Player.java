import java.util.*;

public class Player {
  // fields
  private ArrayList<String> hand = new ArrayList<>();
  private int money;
  private int currentBet;

  // constructors
  public Player() {
    money = 200;
    currentBet = 0;
  } // constructor end

  //getters and setters
  public ArrayList<String> getHand() {
    return hand; 
  } // getter end
  public int getMoney() {
    return money;
  } // getter end
  public int getCurrentBet() {
    return currentBet;
  } // getter end
  public void setHand(ArrayList<String> newHand) {
    hand = newHand;
  } // setter end
  public void setMoney(int newMoney) {
    money = newMoney;
  } // setter end
  public void setCurrentBet(int newCurrentBet) {
    currentBet = newCurrentBet;
  } // setter end

  // methods
  public void call(int highestBet) {
    int betDiff = highestBet - currentBet;
    money -= betDiff;
    currentBet = highestBet;
  } // method end
  public void raise(int highestBet, int newBet) {
    highestBet = highestBet + newBet;
    int betDiff = highestBet - currentBet;
    money -= betDiff;
    currentBet = highestBet;
  } // method end
  public void fold() {
    hand.remove(0);
    hand.remove(0);
  } // method end
} // Class end 