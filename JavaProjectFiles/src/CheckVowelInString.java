import java.util.Scanner;
public class CheckVowelInString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            scanner.close();
            System.out.println("Checking for vowels in the string...");
            boolean hasVowel = false;
            for (int i = 0; i < inputString.length(); i++) {
                char ch = Character.toLowerCase(inputString.charAt(i));
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    hasVowel = true;
                    break;
                }
            }
            if (hasVowel) {
                System.out.println("The string contains at least one vowel.");
            } else {
                System.out.println("The string does not contain any vowels.");
            }
        }
    }

