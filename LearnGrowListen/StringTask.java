import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

       
        StringBuilder modified = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (isVowel(c)) {
                modified.append('*');
            } else {
                modified.append(c);
            }
        }

        
        System.out.println("Modified word: " + modified.toString());
    }

   
    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}