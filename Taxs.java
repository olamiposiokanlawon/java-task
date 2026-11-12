import java.util.Scanner;
public class Taxs {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    for(int i = 1; i <= 3; i++) {
 
    System.out.print("Enter name: ");
    String name = input.next();
    
    System.out.print("Enter earnings: ");
    int earnings = input.nextInt();
    
    double tax;

 
    if (earnings <= 30000) {
      tax = earnings * 0.15;
    }else{
      tax = 4500 + (earnings - 30000) * 0.20;
    }
    
   System.out.println("name: " + name);
   System.out.println("tax: " + earnings);
  }
 }
}