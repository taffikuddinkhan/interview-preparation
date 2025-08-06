public class Smallestelem21 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7};
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Smallest element in the array: " + smallest);
    }
    
}
