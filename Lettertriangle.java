public class Lettertriangle {

    public static void main(String[] args) {
        
        String nam = "ramana";
        int length = nam.length();
        String temp = "";

        for(int i = 0 ; i<length ; i++){

            temp += nam.charAt(i);
            System.out.print(temp + "\n");
        }
    }
    
}
