import java.util.Scanner;

public class GameTest {

    public static void main(String[] args) throws InterruptedException{

        boolean finish;
        Game myGame = new Game();
        GuessableType t;
        Scanner scan = new Scanner(System.in);
        Guessable g;// = myGame.generateGuessable(t);
        String s;
        Result r;
        int option = 0;

        System.out.printf("1. Play with digits\n2. Play with characters (a-z)\nChoose: ");
        try {
            option = scan.nextInt();
        }
        catch (java.util.NoSuchElementException e){
            System.out.println("\nGame Quit!");
        }
        if (option == 1)
            g = myGame.generateGuessable(GuessableType.INTEGER);
        else if (option == 2)
            g = myGame.generateGuessable(GuessableType.CHARACTER);
        else {
            System.out.println("Wrong input! Default - digits");
            g = myGame.generateGuessable(GuessableType.INTEGER);
        }

        System.out.println("The computer prepared the number/chars!");

        try {
            do {
                s = myGame.readConsoleLine();
                r = g.guess(s);
                System.out.printf("bulls: %d cows: %d\n", r.getBulls(), r.getCows());
                finish = (r.getBulls() == 4);
            } while (!finish);
            System.out.println("Congrats! You win!");
        }
        catch (java.util.NoSuchElementException e){
            System.out.println("\nGame Quit!");
        }


    }

}
