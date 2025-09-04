import java.util.Scanner;

public class Bubblesort{

    public static void bubblesort(int arr[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values to enter in the array : ");
        for(int i = 0 ; i<arr.length ;i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("Array before sorting : ");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }



        for(int i = 0 ; i<arr.length-1 ; i++){
            
            for(int j = 0 ; j<arr.length-1-i ; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\n" + "The array after sorting : ");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();

    }

    public static void main(String[] args) {
        
        int[] arr = new int[5];
        bubblesort(arr);

    }
}