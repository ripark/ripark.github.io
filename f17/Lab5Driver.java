// Lab5Driver.java
// Test program for Lab 5, Balanced Symbol Checker
// Alan Jamieson
// COSC 201
// Fall 2017
// October 24, 2017

public class Lab5Driver{

  public static void main(String[] args){
    BalancedSymbolChecker b = new BalancedSymbolChecker();

    //test 1 - valid test 1
    System.out.println("Should print - Balanced");
    if (b.SymCheck("(())"))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 2 - valid test 2
    System.out.println("Should print - Balanced");
    if (b.SymCheck("[{({[(([]))]}())[]}]"))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 3 - long valid test
    System.out.println("Should print - Balanced");
    if (b.SymCheck("(((((((([[[[[[[[{{{{{{{{}}}}}}}}]]]]]]]]))))))))"))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 4 - empty valid test
    System.out.println("Should print - Balanced");
    if (b.SymCheck(""))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 5 - invalid, not enough closed parens
    System.out.println("Should print - Error");
    if (b.SymCheck("[([()])"))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 6 - invalid, too many closed parens
    System.out.println("Should print - Error");
    if (b.SymCheck("[[{[]}]])]"))
      System.out.println("Balanced");
    else
      System.out.println("Error");

    //test 7 - invalid, nesting
    System.out.println("Should print - Error");
    if (b.SymCheck("[(]){}"))
      System.out.println("Balanced");
    else
      System.out.println("Error");
  }
}
