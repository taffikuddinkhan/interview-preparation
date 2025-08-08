public class Uppertolower {

    public static void main(String[] args) {

        String name ="taffik";



        for(int i = 0; i<name.length();i++){

            char ch = name.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char upper = (char)(ch - 32);
                System.out.print(upper);
            }

        }
        
    }
    
}
