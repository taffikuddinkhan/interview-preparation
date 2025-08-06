public class Reverseeachword {

    public static void main(String[] args) {
        String name = "java is very easy";
        String[] words = name.split(" "); 

        for (int i = 0; i < words.length; i++) {

            String reversedString = new StringBuilder(words[i]).reverse().toString();
            System.out.print(reversedString + " ");
        }

    }
}

    

