public class Secondsmall23 {
    
      public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }

        }

        if (secondsmallest == Integer.MIN_VALUE) {
        System.out.println("No second smallst element availavle in the array.");
        }
        else{
        System.out.println("Second smallest element : " + secondsmallest);
        }
    }

}
