import java.util.*;
public class Question6
{
   public static void main(String[]args)
   {
   
   Scanner in = new Scanner(System.in);
   System.out.println("Enter first number: ");
   int x = in.nextInt();
   System.out.println("Enter second number: ");
   int y =in.nextInt();
   System.out.println("The Product of " + x + " and "+ y + " is: " + Math.multiplyExact(x,y));
   }
}