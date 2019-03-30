import java.util.Arrays;

public class Calculator{
 /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, separated by spaces.
  */

 public static double eval(String s){
   String[] op = {"*", "-", "*", "/"};
   String[] vals = s.split(" ");
   MyDeque<Double> output = new MyDeque<Double>();
   for (int x = 0; x < vals.length; x++) {
     if (vals[x].equals("+")) {
       // System.out.println("in here");
       // System.out.println(vals[x]);
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
       output.addLast(one + two);
     }
     else if (vals[x].equals("-")){
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
       output.addLast(two - one);
     }
     else if (vals[x].equals("*")){
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
       output.addLast(one * two);
     }
     else if (vals[x].equals("/")){
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
       output.addLast(one / two);
     }
     else if (vals[x].equals("%")){
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
       output.addLast(one % two);
     }
     // else if (vals[x].equals(".")){
     //   int one = output.getLast();
     //   output.removeLast();
     //   String temp = "";
     //   temp += one;
     //   System.out.println("HERE");
     //
     //   for (int y = x; y < vals.length && vals[y] != " "; y++) {
     //     temp += vals[y];
     //   }
     //   output.addLast(Integer.parseInt(temp));
     // }
     else{
       // System.out.println("VAL " + vals[x]);
       // System.out.println(vals[x]);
       output.addLast(Double.parseDouble(vals[x]));
     }
   }
   return output.getLast();
 }
}
