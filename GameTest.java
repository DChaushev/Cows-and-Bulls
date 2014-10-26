import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) {

        boolean finish;
        Game myGame = new Game();
        Guessable g;
        String s;
        Result r;
        Scanner scan = new Scanner(System.in);

        System.out.printf("1. Play with digits\n2. Play with characters (a-z)\nChoose: ");
        int option = scan.nextInt();
        if (option == 1)
            g = myGame.generateGuessable(GuessableType.INTEGER);
        else if (option == 2)
            g = myGame.generateGuessable(GuessableType.CHARACTER);
        else {
            System.out.println("Wrong input! Default - digits");
            g = myGame.generateGuessable(GuessableType.INTEGER);
        }
        System.out.println("The computer prepared the number/chars!");


//this stays for testing
//		for (int i = 0; i < g.items.length; i++) {
//			System.out.println(g.items[i].toString());
//		}

        do {
            s = myGame.readConsoleLine();
            r = g.guess(s);
            System.out.printf("bulls: %d cows: %d\n", r.getBulls(), r.getCows());
            finish = (r.getBulls() == 4);
        } while (!finish);

        System.out.println("Congrats! You win!");

        myGame.closeScanner();
    }

}
