import java.util.Scanner;
public class Chararray {

    public static void main(String[] args) {
        
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char arr[] = new char[size];
        System.out.println("Enter the values : ");
        for (int i = 0; i < size; i++) {
         
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("The characters in the array in reverse order:");
        for (int i = arr.length-1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
    
}
