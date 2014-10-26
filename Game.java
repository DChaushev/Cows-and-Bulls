import java.util.Scanner;

public class Game {

    private Scanner scan = new Scanner(System.in);
    private String numbers;

    public String readConsoleLine() {
        System.out.printf("Enter: ");
        numbers = scan.nextLine();
        return numbers;
    }

    public Guessable generateGuessable(GuessableType type) {
        return new Guessable(type);
    }

    public void closeScanner() {
        scan.close();
    }
}
