import java.util.*;

public class Inserteven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        int index = 0;
        System.out.println("Enter even numbers:");

        while (index < size) {
            int number = sc.nextInt();

            if (number % 2 == 0) {

                arr[index] = number;
                index++;
            } 
            else 
            {
                System.out.println("Please enter an even number.");
            }
        }

        System.out.println("Array is full");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }  
    }
}
