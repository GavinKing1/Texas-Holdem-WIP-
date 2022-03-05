import java.util.*;

class Main {
  public static void main(String[] args) {
    // initialize players
    Player player1 = new Player();
    Player bot1 = new Player();
    Player bot2 = new Player();
    Player bot3 = new Player();

    // determine starting blinds
    int bigBlind = (int)(Math.random() * 4);
    
    // the main hand loop
    while (player1.getMoney() > 0) {
      // clears the screen
      erase();

      // create and shuffle the deck
      ArrayList<String> deck = Deck.FULL_DECK;
      deck = Deck.shuffle(deck);

      // deal the hands
      ArrayList<String> hand1 = new ArrayList<>();
      Deck.deal(hand1, deck, 2);
      ArrayList<String> hand2 = new ArrayList<>();
      Deck.deal(hand2, deck, 2);
      ArrayList<String> hand3 = new ArrayList<>();
      Deck.deal(hand3, deck, 2);
      ArrayList<String> hand4 = new ArrayList<>();
      Deck.deal(hand4, deck, 2);
      player1.setHand(hand1);
      bot1.setHand(hand2);
      bot2.setHand(hand3);
      bot3.setHand(hand4);

      // blind bets + pot initialization
      int pot = 0;
      bigBlind = 0; // temp
      int turn;
      int highestBet = 0;
      Scanner input = new Scanner(System.in);
      String command = "";
      boolean cont = true;
      while (cont) {
        switch (bigBlind) {
          case 0:
            System.out.println("You are the big blind!\nYou have bet $2!\n");
            bot3.raise(highestBet, 1);
            highestBet++;
            player1.raise(highestBet, 1);
            highestBet++;
            turn = 1;
            break;
          case 1:
            System.out.println("You are the small blind!\nYou have bet $2!");
            player1.raise(highestBet, 1);
            highestBet++;
            bot1.raise(highestBet, 1);
            highestBet++;
            turn = 2;
          case 2:
            bot1.raise(highestBet, 1);
            highestBet++;
            bot2.raise(highestBet, 1);
            highestBet++;
            turn = 3;
          case 3:
            bot2.raise(highestBet, 1);
            highestBet++;
            bot3.raise(highestBet, 1);
            highestBet++;
            turn = 0;
        } // switch end
        pot += 3;
        System.out.println("Pot: $" + pot + "\n\nYour hand: " + player1.getHand() + "\n\nYour money: $" + player1.getMoney());
        System.out.println("\nWhat would you like to do?");
        System.out.println("Type c to check, r to raise, or f to fold.");
        command = input.nextLine();
        switch(command.toLowerCase()) {
          case "c":
            break;
          case "r":
            System.out.println("How much would you like to raise by?");
            command = input.nextLine();
            player1.raise(highestBet, Integer.valueOf(command));
            pot += Integer.valueOf(command);
            break;
          case "f":
            player1.fold();
            break;
          default:
            System.out.println("That's not a valid command. Please try again.");
            break;
        } // switch end
      if (bot1.getMoney() == 0 && bot2.getMoney() == 0 && bot3.getMoney() == 0)
        break;
      break;
        } // while end
    } // while end
  

    // victory / loss message
    if (player1.getMoney() > 0)
      System.out.println("Congratulations! You win!\n\nTo play again, run the program again!");
    else
      System.out.println("You lose!\n\nTo play again, run the program again!");
    
  } // method end
    
  // erases the console
  public static void erase() {
    System.out.print("\033[H\033[2J");
  } // method end
} // Class end