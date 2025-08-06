public class Arraynum {
    public static void main(String[] args) {
        String name = "raman123";
        String letters = "";
        int sum = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch >= '0' && ch <= '9') {
              
                String digitval = String.valueOf(ch);  
                int digit = Integer.parseInt(digitval);   
                sum = sum + digit;
            } else {
                letters += ch;
            }
        }

        System.out.println(letters+sum);  
    }
}
