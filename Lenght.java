import java.util.Scanner;
public class Lenght{
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);

 System.out.print("enter length");
 int length = input.nextInt();
 System.out.print("enter breadth: ");
 int breadth = input.nextInt();

int area = length * breadth;
int perimeter = 2 * (length + breadth);

System.out.println ("area = " + area );
System.out,print.ln ("perimeter= " + perimeter);
if ( area > perimeter);{
system.out.println("area is greater than perimeter");
}else{
System.out.print("area is not greater than perimeter");
}
}
]
