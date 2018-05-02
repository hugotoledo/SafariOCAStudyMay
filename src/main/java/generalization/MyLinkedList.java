package generalization;

import java.util.LinkedList;

public class MyLinkedList implements MyList {
  private LinkedList<String> store = new LinkedList<>();

  public boolean add(String s) {
    return store.add(s);
  }

  public String get(int idx) {
    return store.get(idx);
  }

  public int size() {
    return store.size();
  }
}
