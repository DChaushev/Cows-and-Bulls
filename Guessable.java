
public class Guessable {

	
	public static GuessableItem[] items = new GuessableItem[4];
	private static int n = 0;
	
	
	public Guessable(GuessableType type) {
		items = generate(type);
	}
	
	public static boolean ifExists(GuessableItem newItem){
		for (int j = 0; j < n; j++) {
			if(items[j].equals(newItem)){
				return true;
			}
		}
		return false;
	}
	
	public static GuessableItem[] generate(GuessableType type){
		switch (type) {
		case INTEGER:
			for (int i = 0; i < items.length; i++) {
				IntegerGuessableItem newIntItem = new IntegerGuessableItem();
				newIntItem.generateItem();
				while(ifExists(newIntItem)){
					newIntItem.generateItem();
				}
				items[i] = newIntItem;
				n++;
			}
			
			break;
		case CHARACTER:
			for (int i = 0; i < items.length; i++) {
				CharacterGuessableItem newCharItem = new CharacterGuessableItem();
				newCharItem.generateItem();
				while(ifExists(newCharItem)){
					newCharItem.generateItem();
				}
				items[i] = newCharItem;
				n++;
			}
			break;
		default:
			break;
		}
		return items;
	}
	
	public static Result guess(String data){
		int bulls = 0;
		int cows = 0;
		for (int i = 0; i < data.length(); i++) {
            for (int j = 0; j < items.length; j++) {
                if(items[j].compareTo(data.charAt(i))){
					if(i == j) bulls++;
                    else cows++;
				}
			}
		}
		return new Result(cows, bulls);
	}
	
}
