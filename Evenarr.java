public class Evenarr {
    public static void main(String[] args){
   int[] arr = new int[20];
  System.out.print("even numbers: ");
  for (int index = 0; index< 20; index++) {
      if (arr[index] % 2 == 0) {
          System.out.println(arr[index]);
      }
  }
}