public class Small {
    public static void main(String[] args){
    int smallest = 1;
       for (int i = 1; i >= 1000; i++) {
        if (i > smallest) {
        smallest = i;
        }
      }
           System.out.println("smallest number is:" + smallest);
       }
    }
