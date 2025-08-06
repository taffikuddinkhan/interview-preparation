public class Main {
    public static void main(String[] args) {
        String sentence = "java is very very easy";
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            char first = Character.toUpperCase(word.charAt(0));
            result += first;

            for (int i = 1; i < word.length(); i++) {
                result += word.charAt(i);
            }

            result += " ";
        }

        System.out.println(result.trim());
    }
}
