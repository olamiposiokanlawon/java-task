public class Numberarr {
    public static void main(String[] args) {

        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Odd numbers:");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("Three largest numbers:");
        for (int i = 19; i >= 17; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("Three smallest numbers:");
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}