import java.util.Random;

public class Game {
  Random random = new Random();
  int numberOfItemsInJar;
  int maximumItemsInJar;
  String itemName;
  int someNumber;
  int userGuess;
  int numberOfGuesses = 0;
  boolean isCorrectGuess = false;
  
  public Game(int numberOfItemsInJar) {
    this.numberOfItemsInJar = numberOfItemsInJar;
  }

  public int fillJar() {
    someNumber = random.nextInt(maximumItemsInJar);
    if ((someNumber < 1) || (someNumber > maximumItemsInJar)) {
      someNumber = random.nextInt(maximumItemsInJar);
    } else {
    System.out.printf("The Jar has been filled with a random number of %s!\n",
                       itemName);
    }
    return numberOfItemsInJar = someNumber;
  }
  
  public boolean isCorrectGuess(int userGuess) {
    if (userGuess == numberOfItemsInJar) {
      isCorrectGuess = true;
    }
    return isCorrectGuess;
  }
  
  public boolean isWon() {
    return isCorrectGuess(userGuess);
  }
}