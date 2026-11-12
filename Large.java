public class Large{
    public static void main(String[] args){
    int largest = 1;
       for (int i = 1; i <= 1000; i++) {
        if (i > largest) {
        largest = i;
        }
      }
           System.out.println("largest number is:" + largest);
       }
    }
