import java.util.NoSuchElementException;

public class MyDeque<E>{
  public static void main(String[] args) {
    MyDeque<Integer> e = new MyDeque<Integer>();

    System.out.println(e.toString());

    for (int x = 5; x > 0; x--) {
      e.addFirst(x);
    }

    for (int y = 0; y < 5; y++) {
      e.addLast(y);

    }
    System.out.println(e.toString());


  }


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
      output += data[(start + x) % data.length] + " ";
    }
    output += "]";
    return output;
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    replace = (E[])new Object[data.length * 2 + 1];
    size = data.length * 2 + 1;


    for (int x = 0; x < data.length; x++){
      replace[x] = data[x];
    }
    data = replace;
  }

  public void addFirst(E element){
    if (element == null) throw new NullPointerException();
    if (size == data.length) resize();

    System.out.println("ELEMENT: " + element);
    start = mod(start - 1, data.length);
    data[start] = element;
    size++;
  }

  public void addLast(E element){
    if (element == null) throw new NullPointerException();

    end++;
    data[end] = element;
    size++;

  }

  private int mod(int one, int two){
    int output = one % two;
    if (output < 0) output += two;
    return output;
  }

  public E removeFirst(){
    if (size == 0) throw new NoSuchElementException();

    // if (start == 0){
    //   start = data.length -1;
    // }
    // else{
      start++;
      size--;
      return data[start-1];
    // }
  }

  public E removeLast(){
    if (size == 0) throw new NoSuchElementException();

    if (end == 0){
      E temp = data[end];
      end = data.length - 1;
      size--;
      return temp;
    }
    else{
      E temp = data[end];
      end--;
      size--;
      return temp;
    }
  }

  public E getFirst(){
    if (size == 0) throw new NoSuchElementException();
    return data[start];
  }

  public E getLast(){
    if (size == 0) throw new NoSuchElementException();
    return data[end];
  }

}

class Calculator{
 /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, separated by spaces.
  */
 public static double eval(String s){
   return 1;
 }
}
