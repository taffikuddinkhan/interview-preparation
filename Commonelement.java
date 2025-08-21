public class Commonelement {

    public static void findcommon(int arr[] , int arr2[]){

       

        for(int i = 0 ; i<arr.length; i++){

            for(int j = 0 ; j<arr2.length ; j++){

                if(arr[i] == arr2[j]){

                    System.out.print(arr[i] + " ");
                    break;
                }
            }

          
        }

    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,2,8};
        int[] arr1 = {9,2,5,7,6,3,2};
        findcommon(arr, arr1);
    }
    
}
