import java.util.Random;

public class IntegerGuessableItem extends GuessableItem {

	private int item;
	private Random rand = new Random();


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + item;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegerGuessableItem other = (IntegerGuessableItem) obj;
		if (item != other.item)
			return false;
		return true;
	}

	@Override
	public void generateItem() {
		this.item = rand.nextInt(10);
	}

	public int getItem() {
		return item;
	}

    public boolean compareTo(char s){
        if(this.getItem() == Character.getNumericValue(s)){
            return true;
        }
        return false;
    }

	@Override
	public String toString() {
		return String.format("%d", item);
	}
	
}
