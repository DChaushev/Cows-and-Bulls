import java.util.Random;


public class CharacterGuessableItem extends GuessableItem {

    private char item;
    private Random rand = new Random();

    @Override
    public void generateItem() {
        this.item = (char) (rand.nextInt(26) + 'a');
    }

    public char getItem() {
        return item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacterGuessableItem that = (CharacterGuessableItem) o;

        if (item != that.item) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) item;
    }

    @Override
    public boolean compareTo(char c) {
        if (this.getItem() == c)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return Character.toString(item);
    }
}
