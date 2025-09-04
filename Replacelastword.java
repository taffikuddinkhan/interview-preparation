import java.util.Scanner;

public class Replacelastword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        
        if (input.toLowerCase().endsWith("python")) {
            
            String result = input.substring(0, input.lastIndexOf("python")) + "java";
            System.out.println("Modified string: " + result);

        } else {
            System.out.println("The string does not end with 'python'.");
        }

        sc.close();
    }
}
