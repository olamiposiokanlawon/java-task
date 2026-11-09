import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();

            for (int j = 0; j < i; j++) {
                if (arr[j] == number) {
                    number = -1;
                }
            }

            arr[i] = number;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] != -1) {
                System.out.println(arr[i]);
            }
        }
    }
}