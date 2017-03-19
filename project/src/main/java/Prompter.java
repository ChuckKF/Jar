import java.util.Scanner;

class Prompter {
  private Game game;
  
  public Prompter(Game game) {
    this.game = game;
  }
  
  Scanner scanner = new Scanner(System.in);
  
  public String setItemName() {
    System.out.printf("||||| ADMINITSTRATOR SETUP |||||\n");
    System.out.printf("What type of item? \n");
    game.itemName = scanner.nextLine();
    return game.itemName;
  }
  public int setItemLimit() {
    System.out.printf("What is the maximum amount of %s?\n",
                      game.itemName);
    game.maximumItemsInJar = scanner.nextInt();
    System.out.printf("||||| END ADMINISTRATOR SETUP |||||\n");
    return game.maximumItemsInJar;
  }
  
  public boolean promptForGuess() {
    ++game.numberOfGuesses;
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d.\n",
                      game.itemName, game.maximumItemsInJar);
    game.userGuess = scanner.nextInt();
    
    if (game.userGuess > game.maximumItemsInJar) {
      System.out.printf("You guess must be less than %d.\n",
                        game.maximumItemsInJar);
      game.numberOfGuesses--;
    }
    return game.isCorrectGuess(game.userGuess);
  }
  
  public void isGuessClose() {
    if (game.userGuess > game.numberOfItemsInJar) {
      System.out.printf("Your guess was too high.\n");
    } else if (game.userGuess < game.numberOfItemsInJar) {
      System.out.printf("Your guess was too low.\n");
    } else if (game.userGuess > game.maximumItemsInJar) {
      System.out.printf("You guess must be less than %d\n.",
                        game.maximumItemsInJar);
    }
  }
  
  public void victoryMessage() {
    System.out.printf("Congratulations! You got it in %d attempts.\n",
                      game.numberOfGuesses);
  }
}