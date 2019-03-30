import java.util.Arrays;

public class Calculator{
 /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, separated by spaces.
  */

 public static double eval(String s){
   String[] op = {"*", "-", "*", "/"};
   String[] vals = s.split(" ");
   MyDeque<Integer> output = new MyDeque<Integer>();
   for (int x = 0; x < vals.length; x++) {
     if (vals[x].equals("+")) {
       // System.out.println("in here");
       // System.out.println(vals[x]);
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one + two);
     }
     else if (vals[x].equals("-")){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(two - one);
     }
     else if (vals[x].equals("*")){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one * two);
     }
     else if (vals[x].equals("/")){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one / two);
     }
     else if (vals[x].equals("%")){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one % two);
     }
     else{
       // System.out.println(vals[x]);
       output.addLast(Integer.parseInt(vals[x]));
     }
   }
   return output.getLast();
 }
}
