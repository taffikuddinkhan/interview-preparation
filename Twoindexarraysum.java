public class Twoindexarraysum {

    public static void main(String[] args) {
        
        int arr[] = {2,7,11,15};

        int sum = 0 ;
        int target = 9;

        for(int i = 0 ; i<arr.length;i++){

            if(arr[i]+arr[i+1] == target){

             int secondindex = i+1; 
             int firstindex = i;  
            System.out.println("The first index is  : - " + firstindex);
            System.out.println("The Second index is  : - " +secondindex);
            break;

            }

        }
    }
    
}
