
public class Mergearray {

    public static void mergeandsort(int arr[], int arr2[]) {

        int[] newarray = new int[arr.length + arr2.length];

        for (int i = 0; i < arr.length; i++) {
            newarray[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            newarray[arr.length + i] = arr2[i];
        }

        int evencount = 0;
        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] % 2 == 0) {
                evencount++;
            }
        }

        int[] evenarr = new int[evencount];
        int[] oddarr = new int[newarray.length - evencount];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 0; i < newarray.length; i++) {
            if (newarray[i] % 2 == 0) {
                evenarr[evenIndex] = newarray[i];
                evenIndex++;
            } else {
                oddarr[oddIndex] = newarray[i];
                oddIndex++;
            }
        }



            for (int i = 0; i < evenarr.length - 1; i++) {

                for (int j = 0; j < evenarr.length - i - 1; j++) {

                    if (evenarr[j] > evenarr[j + 1]) {
                    int temp = evenarr[j];
                    evenarr[j] = evenarr[j + 1];
                    evenarr[j + 1] = temp;
                
                    }
                }
            }


        
        for (int i = 0; i < oddarr.length - 1; i++) {

            for (int j = 0; j < oddarr.length - i - 1; j++) {

                if (oddarr[j] > oddarr[j + 1]) {
                int temp = oddarr[j];
                oddarr[j] = oddarr[j + 1];
                oddarr[j + 1] = temp;

                }
            }
        }



        int idx = 0;
        for (int i = 0; i < evenarr.length; i++) {
            newarray[idx] = evenarr[i];
            idx++;
        }
        for (int i = 0; i < oddarr.length; i++) {
            newarray[idx] = oddarr[i];
            idx++;
        }

        for (int i = 0; i < newarray.length; i++) {
            System.out.print(newarray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 8};
        int[] arr1 = {9, 3, 5, 2};
        mergeandsort(arr, arr1);
    }
}
