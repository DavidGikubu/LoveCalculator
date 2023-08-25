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

    }
}
