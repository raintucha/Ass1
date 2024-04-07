import java.util.Scanner;

public class DigitsOnly {

    public static boolean isDigitsOnly(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if (isDigitsOnly(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}