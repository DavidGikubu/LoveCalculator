import java.util.Scanner;

public class LoveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first person's name
        System.out.print("Enter the first person's name: ");
        String person1 = scanner.nextLine().toUpperCase();

        // Prompt the user for the second person's name
        System.out.print("Enter the second person's name: ");
        String person2 = scanner.nextLine().toUpperCase();

        // Count the occurrences of "TRUE" and "LOVE" in both names
        int trueCount = countOccurrences(person1, "TRUE") + countOccurrences(person2, "TRUE");
        int loveCount = countOccurrences(person1, "LOVE") + countOccurrences(person2, "LOVE");

        // Calculate the love score using the specified formula
        int loveScore = trueCount * 10 + loveCount;

        // Display the calculated love score
        System.out.println("Love Score: " + loveScore);
    }

    // Function to count the occurrences of a target string within another string
    private static int countOccurrences(String text, String target) {
        int count = 0;
        int index = text.indexOf(target);
        while (index != -1) {
            count++;
            index = text.indexOf(target, index + 1);
        }
        return count;
    }
}
