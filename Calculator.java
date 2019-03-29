public class Calculator{
 /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, separated by spaces.
  */

 public static double eval(String s){
   String[] op = {"*", "-", "*", "/"};
   String[] vals = s.split(" ");
   MyDeque<Integer> output = new MyDeque<Integer>();
   for (int x = 0; x < vals.length; x++) {
     if (op.contains(vals[x])){
       // get the last two numbers on the stack
       int one = output.getLast();
       output.removeLast();
       int two = output.getLast();
       output.removeLast();

     }
   }
 }
}
