import java.util.Scanner;
public class HelloThere{
  public static void main (String[] args){
  Scanner Userinput = new Scanner(System.in);

  System.out.print("enter a number: ");
  int number1 = Userinput.nextInt();


  System.out.print("enter a number: ");
  int number2 = Userinput.nextInt(); 

  int sqaure1 = number1 * number1;
  int sqaure2 = number2 * number2;

  int sum = sqaure1 + sqaure2;

  System.out.println("square of first number: " + sqaure1);
  System.out.println("square of second number: " + sqaure2);
  System.out.println("sum of the square: " + sum);



}
}