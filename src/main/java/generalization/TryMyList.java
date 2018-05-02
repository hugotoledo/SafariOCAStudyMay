package generalization;

public class TryMyList {

  public static void showAll(MyList mal) {
    for (int x = 0; x < mal.size(); x++) {
      System.out.println("> " + mal.get(x));
    }
    System.out.println("----------------");
  }

  public static void main(String[] args) {
//    MyArrayList ml = new MyArrayList();
    MyList ml = new MyArrayList();
    ml.add("Fred");
    ml.add("Jim");
    ml.add("Sheila");

    System.out.println("Item at pos 1 is " + ml.get(1));
    showAll(ml);
  }
}
