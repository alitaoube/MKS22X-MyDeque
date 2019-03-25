public class MyDeque<E>{
  public static void main(String[] args) {
    MyDeque<Integer> e = new MyDeque<Integer>();

    e.addFirst(5);
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
    size = 10;
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
    String output = "";
    int s = start;
    while(s != end){
      if (s < size){
        output += s;
        s++;
      }
      else{
        s = 0;
      }
    }
    return output;
  }

  @SuppressWarnings("unchecked")
  private void resize(){
    replace = (E[])new Object[data.length * 2 + 1];

    for (int x = 0; x < data.length; x++){
      replace[x] = data[x];
    }
    data = replace;
  }

  public void addFirst(E element){
    if (size == 0){
      data[start] = element;
    }
  }

  public void addLast(E element){
    end++;
    data[end] = element;
  }

  public E removeFirst(){
    // if (start == 0){
    //   start = data.length -1;
    // }
    // else{
      start++;
      return data[start-1];
    // }
  }

  public E removeLast(){

  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
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
