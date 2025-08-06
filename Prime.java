import java.util.Scanner;
 
public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int val = sc.nextInt();

        System.out.println("Prime numbers from 0 to " + val + ":");

        for (int i = 2; i <= val; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }         

       
    }
}
