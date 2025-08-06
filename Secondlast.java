public class Secondlast {
    
    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (arr.length < 2) {
            System.out.println("Array does not have enough elements.");
        } else {
            System.out.println("Second last element in the array: " + arr[arr.length-2]);
        }
    }
}
