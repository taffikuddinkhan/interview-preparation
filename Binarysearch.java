
import java.util.Scanner;

public class Binarysearch {

    public static void searchelement(int arr[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the element to search : ");
        int search = sc.nextInt();

        int start = 0 ; 
        int end = arr.length-1;
        boolean found = false;


        while(start <= end ){

       int mid = start + (end - start) / 2;

        if(arr[mid]==search){
            System.out.println("The valu " + search + " is found at " + mid + " Index");
            found = true;
            break;
        }
        else if (arr[mid] < search) {
                start = mid + 1;
        } 
        else {
                end = mid - 1;
        }
        

        }

        if(found==false){
            System.out.println("Element not found....!");
        }


    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 8, 9};
        searchelement(arr);

    }

}
