import java.util.Scanner;

public class FirstPartWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = scanner.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(scanner.nextLine());

        if (length <= word.length()) {
            String firstPart = word.substring(0, length);
            System.out.println("Result: " + firstPart);
        } else {
            System.out.println("Result: " + word);
        }

        scanner.close();
    }
}
