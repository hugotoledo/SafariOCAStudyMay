package exceptionstuff;

class ReallyMessedUp extends RuntimeException {}
class UserMessedUp extends Exception {}

public class Ex1 {
  public static void hasABug() {
    if (Math.random() > 0.5) {
      throw new ReallyMessedUp();
    }
  }

  public static void badUserInteraction() throws UserMessedUp {
    if (Math.random() > 0.5) {
      throw new UserMessedUp();
    }
  }
  public static void main(String[] args) {
//    hasABug();
    try {
      badUserInteraction();
    } catch (UserMessedUp ume) {
      System.out.println("that broke!");
    }
    System.out.println("Success");
  }
}
