public class Printprime {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Prime numbers in the array:");

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int count = 0;
          
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(num);
            }
        }
    }
}
