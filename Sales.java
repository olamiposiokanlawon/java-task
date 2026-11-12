import java.util.Scanner;
public class Sales {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   double total = 0;
    for (int i = 1; i <=4; i++) {
        System.out.print("Enter item price: ");
     double item = input.nextInt();
        total = total + item;
   }
   System.out.println("Earnings = " + (200 + total * 9 / 100));
 }
}