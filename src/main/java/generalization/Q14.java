package generalization;

class MyNotFinalStringBuilder {}
interface Base3 {}
class Oddity extends MyNotFinalStringBuilder implements Base3 {}

public class Q14 {
  public static void main(String[] args) {
    Base3 b = new Oddity();// null; //new Sub();
    MyNotFinalStringBuilder mnfsb =
        ((MyNotFinalStringBuilder)b);//.concat("x");
  }
}
