public class Count {
    public static void main(String[] args) {
        

        int arr[] = {1,2,1,3,2,4};
        int small = arr[0];
        int Count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("The small element  is " + small);
        
    }

}