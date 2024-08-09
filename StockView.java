package view;

/**
 * This interface represents the view/where everything is printed from for Stock/StocksPortfolios.
 */
public interface StockView {

  /**
   * Prints the welcome message of the program including:
   * all commands and explanations of commands.
   */
  void welcomeMessage();

  /**
   * Prints the farewell message of the program.
   */
  void farewellMessage();

  /**
   * Prints a given message for the program.
   * @param message the message being printed.
   * @throws IllegalStateException if the message cannot be printed.
   */
  void writeMessage(String message) throws IllegalStateException;

  public Readable getReadable();
}
