package generalization;

import java.util.NoSuchElementException;

/*
 * Allows adding items into a sequence
 * and retrieving by index...
 */
public class MyArrayList implements MyList {
  private int capacity = 10;
  private String[] data = new String[capacity];
  private int count = 0;

  public boolean add(String s) {
    if (count < capacity) {
      data[count++] = s;
      return true;
    } else return false;
  }

  public String get(int idx) {
    if (idx < count) {
      return data[idx];
    } else throw new NoSuchElementException("bad index " + idx);
  }

  public int size() {
    return count;
  }
}
