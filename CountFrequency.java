public class CountFrequency {

    public static void countfreq(int arr[]){


        for(int i = 0 ; i<arr.length ; i++){

        int freq = 0;
        boolean check = false;

        for (int n = 0; n < i; n++) {

            if (arr[i] == arr[n]) {
                check = true;
                break;
            }

        }

        if (check) {
            continue; 
        }


        for (int j = i; j < arr.length; j++) {

            if (arr[i] == arr[j]) {
                freq++;
            }

        }

        System.out.println(arr[i] + " happends " + freq + " times");

        }

    }

    public static void main(String[] args) {
        
        int[] arr = {1,1,1,2,2,9,9,3,3};
        countfreq(arr);

    }
    
}
