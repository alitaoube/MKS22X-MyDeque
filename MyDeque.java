public class MyDeque<E>{
  private E[] data;
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
    size = initialCapacity;
  }

  public int size(){
    return size;
  }

  public String toString(){
    String output = "";
    int s = start;
    while(s != end){
      if (s < size){
        output += s
        s++;
      }
      else{
        s = 0;
      }
    }
  }

  public void addFirst(E element){

  }

  public void addLast(E element){

  }

  public E removeFirst()){

  }

  public E removeLast(){

  }

  public E getFirst(){

  }

  public E getLast(){

  }
}