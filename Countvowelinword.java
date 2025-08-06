

public class Countvowelinword {

    public static void main(String[] args) {

        String name = "ramana";
        int vowel = 0;
        name = name.toLowerCase();

        for(int i = 0; i<name.length();i++){

            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch == 'u'){

                vowel++;

            }

        }

        System.out.println("The number of vowels are : " + vowel);
        
        
    }
    
}
