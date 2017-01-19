// just import the BufferedReader and inputstream reader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class addtwonumbers_function
{
       // private = local to this class
       private static int addIntegers(int a, int b)
       {
              return (a+b);
       }
 
       public static void main(String[] args)
       {
              // system.in reader (e.g. the input from the console)
              InputStreamReader ISR = new InputStreamReader(System.in);       
              // buffer the console reader
              BufferedReader BR = new BufferedReader(ISR);                     
 
              // the default values for the two numbers
              int val1 = 0;
              int val2 = 0;
              try 
              {
                     // output the question.
                     System.out.print("Enter first number : ");
                     // read in the console intput one line (BR.readLine) and then convert to a integer
                     val1 = Integer.parseInt(BR.readLine());
                     System.out.print("Enter second number : ");
                     val2 = Integer.parseInt(BR.readLine());
              }
              catch (Exception ex)
              {
                     // if the input was a string.
                     System.out.println(ex.toString());
              }
              // output the answer of adding both of the values together
              System.out.println("Answer = " + addIntegers(val1, val2));
       }
}