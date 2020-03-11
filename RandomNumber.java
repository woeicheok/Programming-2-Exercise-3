import java.util.Random;
public class RandomNumber
{
   public static void main(String[]args)
   {
      Random num = new Random();
      int num1 = num.nextInt(100);
      int num2 = num.nextInt(100);
      int largestNumber = Math.max(num1, num2);
      System.out.println("Number One: " + num1);
      System.out.println("Number Two: " + num2);
      System.out.println("Largest Number: " + largestNumber);
      }
}
   