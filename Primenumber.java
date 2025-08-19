public class Primenumber {

    public static void checkprime(int val){

            for (int i = 2; i <= val; i++) {
            int count = 0;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {  
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {

        int number = 100 ;

        checkprime(number);
    }
}
