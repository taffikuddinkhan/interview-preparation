public class Palindrome {

    public static boolean palind(String s){

        String name = s;
        String reversedString = new StringBuilder(name).reverse().toString();

        if(s.equals(reversedString)){

            return true;
        }
        else{
            return false;
        }

       
    }

    public static void main(String[] args) {

        String nam = "unu";
        boolean val = palind(nam);
        System.out.println(val);
        
    }
    
}
