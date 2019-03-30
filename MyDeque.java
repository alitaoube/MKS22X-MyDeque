import java.util.NoSuchElementException;

public class MyDeque<E>{
  private E[] data;
  private E[] replace;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    start = 0;
    end = 0;
    size = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    start = 0;
    end = 0;
    size = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "[";
    for (int x = 0; x < size(); x ++) {
      output += data[(start + x) % data.length];
      if (x != size() - 1) output += ", ";
    }
    output += "]";
    return output;
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    // double and add one to capacity
    replace = (E[])new Object[data.length * 2 + 1];

    // copy valeus over
    for (int x = 0; x < data.length; x++){
      replace[x] = data[(start + x) % data.length];
    }
    end = size;
    start = 0;
    data = replace;
  }

  public void addFirst(E element){
    if (element == null) throw new NullPointerException();
    if (size >= data.length - 1) resize();

    // System.out.println("ELEMENT: " + element);
    start = mod(start - 1);
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException();

    if (size() >= data.length - 1) resize();

    data[end] = element;

    end = (end+1) % data.length;
    size++;
  }

  private int mod(int one){
    return (one + data.length) % data.length;
  }

  public E removeFirst(){
    if (size == 0) throw new NoSuchElementException();
      start = (start + 1) % data.length;
      size--;
      return data[mod(start - 1)];
  }

  public E removeLast(){
    if (size == 0) throw new NoSuchElementException();

    end = mod(end - 1);
    size--;
    int index = (end + 1) % data.length - 1;
    if (index < 0) index = data.length - 1;
    return data[index];
  }

  public E getFirst(){
    if (size == 0) throw new NoSuchElementException();
    return data[start];
  }

  public E getLast(){
    if (size == 0) throw new NoSuchElementException();
    if (end == 0) return data[data.length - 1];
    return data[end - 1];
  }

}
