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
     // parse through and look for all the operation signs, then perform expected operators
     if (vals[x].equals("+")) {
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
       output.addLast(two / one);
     }
     else if (vals[x].equals("%")){
       double one = output.getLast();
       output.removeLast();
       double two = output.getLast();
       output.removeLast();
         output.addLast(two % one);
     }
     // else just add it to the stack
     else{
       output.addLast(Double.parseDouble(vals[x]));
     }
   }
   return output.getLast();
 }
}
