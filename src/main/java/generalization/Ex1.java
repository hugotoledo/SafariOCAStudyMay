package generalization;

import java.time.LocalDate;
import java.util.*;

public class Ex1 {
  public static List<String> getLongStrings(List<String> ls) {
    List<String> out = new ArrayList<>();
    for (String s : ls) {
      if (s.length() > 3) {
        out.add(s);
      }
    }
    return out;
  }

  public static void showAll(Iterable<String> ls) {
    for (String s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("----------------------");
  }

  public static void main(String[] args) {
//    List<String> ls1 = Arrays.asList("Fred", "Jim", "Sheila");
    List<LocalDate> ls1 = Arrays.asList(LocalDate.now(), LocalDate.now());
//    List<String> ls = new ArrayList<String>(ls1);
    // "diamond operator" infers type from LHS
//    List<String> ls = new ArrayList<>(ls1);
    List<String> ls = new ArrayList<>();
    ls.add("Fred");
//    ls.add(LocalDate.now());
    ls.add("Jim");
    ls.add("Sheila");
    showAll(ls);
    List<String> longStrings = getLongStrings(ls);
    showAll(longStrings);

    Set<String> ss = new HashSet<>(ls);
    showAll(ss);
  }
}
