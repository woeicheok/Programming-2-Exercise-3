public class Question7
{
   public static void main(String[]args)
   {
   String text1 = "School of Computing";
   String text2 = "College of Arts and Sciences";
   String text3 = "UUM Sintok";
   
   System.out.println("Length of " + "\"" + text1 + "\" : " + text1.length());
   System.out.println("Length of " + "\"" + text2 + "\" : " + text2.length());
   System.out.println("Length of " + "\"" + text3 + "\" : " + text3.length());
   System.out.println("Total Length of three text: " + (text1.length()+text2.length()+text3.length()));
   System.out.println(text2.substring(0,20) + text1.substring(10,19));
   }
   }