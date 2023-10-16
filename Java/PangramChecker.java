package Java;

import java.util.*;
public class PangramChecker {
    public static boolean isPangram(String input) {

        HashSet<Character> letters = new HashSet<>();

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') {
                letters.add(c);
            }
        }

        return letters.size() == 26;
    }

    public static void main(String[] args) {
        //String input = "The quick brown fox jumps over the lazy dog.";
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}
