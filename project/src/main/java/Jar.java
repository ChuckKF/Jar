
public class Jar {

  public static void main(String[] args) {
    Game game = new Game(0);
    Prompter prompter = new Prompter(game);
    
    prompter.setItemName();
    prompter.setItemLimit();
    game.fillJar();
    
    while (!game.isWon()) {
      prompter.promptForGuess();
      prompter.isGuessClose();
    }
    
    if (game.isWon()) {
      prompter.victoryMessage();
    }
    
  }
}