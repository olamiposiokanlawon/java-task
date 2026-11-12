import java.util.Scanner;
public class less{
  public static void main (String[] args){
  Scanner Userinput = new Scanner(System.in);

  System.out.print("enter a number: ");
  int number = Userinput.nextInt();

  int sqaure = number * number;

  int sum = sqaure + sqaure;

  if (number > 100 )
  System.out.println(number + "is greater than 100");

  if (number == 100 )
  System.out.println(number + "is equal to 100");

  if (number != 100 )
  System.out.println(number + "is not equal to 100");

  if (number < 100 )
  System.out.println(number + "is less than 100");




}
}