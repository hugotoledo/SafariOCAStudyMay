package generalization;

class Base {
  public void sayHi() {
    System.out.println("Base hi...");
  }
}

class Sub extends Base {
  public void sayHello() {
    System.out.println("Sub hello...");
  }
}

class Other extends Base {}

public class TryCasting {
  public static void doStuff(Base b) {
    b.sayHi();
  }
  public static void main(String[] args) {
    Base b = new Base();
    b.sayHi();
    ((Sub)b).sayHello(); // can fail at runtime!!!

//    System.out.println("------------------");
//    doStuff(new Base());
//    doStuff(new Sub());

//    Other o = new Sub(); // NO!
//    Sub s = new Other(); // NO!!
    Other o = null;
    Sub s = null;
//    o = (Other)s;
  }
}
