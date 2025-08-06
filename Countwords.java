public class Countwords {

    public static void main(String[] args) {

        String sentence = "Please keep quite";
        String[] words = sentence.split("\\s+");
        System.out.println(words.length); 

    }
}
