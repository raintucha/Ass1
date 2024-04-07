import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutations {

    public static void printPermutations(String str) {
        printPermutations("", str);
    }

    private static void printPermutations(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            Set<Character> usedChars = new HashSet<>();
            for (int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if (!usedChars.contains(c)) {
                    usedChars.add(c);
                    printPermutations(prefix + c, str.substring(0, i) + str.substring(i + 1, n));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printPermutations(str);
    }
}