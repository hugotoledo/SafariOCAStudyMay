package generalization;

class Base2 /*implements SubstitutionIF*/ {
  void doBaseStuff() { System.out.println("doBaseStuff");  }
}

class Sub2 extends Base2 {
//  @Override
  void doBaseStuff() { System.out.println("doSubStuff"); }
}

public class Substitution1 {
  public static void main(String[] args) {
    Base2 b2 = new Sub2();
    b2.doBaseStuff();
//    b2.doBaseStuff(99);
  }
}
