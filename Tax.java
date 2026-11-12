import java.util.Scanner;
public class Tax{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

  System.out.print("enter name: ");
  String name1 = input.next();

  System.out.print("enter earnings: ");
  int earnings1 = input.nextInt();

  if(earnings1 <= 30000){
  System.out.print("tax= " + (earnings1 * 15/100));
  }else{
  System.out.println("tax= " + (earnings1 * 20/100));

  System.out.print("Enter name: ");
  String name2 = input.next();

  System.out.print("Enter earnings: ");
  int earnings2 = input.nextInt();

  if (earnings2 <= 30000) {
  System.out.println("Tax = " + (earnings2 * 15 / 100));
  } else {
  System.out.println("Tax = " + (earnings2 * 20 / 100));
  }

 System.out.print("Enter name: ");
 String name3 = input.next();

  System.out.print("Enter earnings: ");
  int earnings3 = input.nextInt();

  if (earnings3 <= 30000) {
  System.out.println("Tax = " + (earnings3 * 15 / 100));
  } else {
  System.out.println("Tax = " + (earnings3 * 20 / 100));
        }
    }
}
}