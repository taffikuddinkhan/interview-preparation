public class Secondlarge22 {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }

        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element available in the array.");
        } else {
            System.out.println("Largest element in the array: " + largest);
        }
       
    }
}
