import java.util.HashSet;
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.replaceAll("\\s", "").toLowerCase();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                uniqueChars.add(currentChar);
            }
        }
        return uniqueChars.size() == 26;
    }
}
