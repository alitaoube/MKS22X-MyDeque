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
     if (vals[x] == "+"){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one + two);
     }
     if (vals[x] == "-"){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one - two);
     }
     if (vals[x] == "*"){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one * two);
     }
     if (vals[x] == "/"){
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();
       output.addLast(one / two);
     }
     else{
       output.addLast(Integer.parseInt(vals[x]));
     }
   }
   return output.getLast();
 }
}
