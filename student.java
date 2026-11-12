import java.util.Scanner;
public class student{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

      System.out.print("enter score: ");
      int score = input.nextInt();

      if (score >= 90 && score <= 100)
      {System.out.println("Grade A");
      } else if (score >= 80) {
      System.out.println("Grade B");
     } else if (score >= 70) {
     System.out.println("Grade C");
    } else if (score >= 50) {
    System.out.println("Grade D");
    } else {
    System.out.println("Grade F");
 }
 }
}