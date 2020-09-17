
public class DiceRollerApp {

	private static int getDiceRoll() {
		int diceRoll = (int)(Math.random() * 6) + 1;
		return diceRoll;
		
	}
	
	private static void printExtraMessage(int dice1, int dice2) {
		if (dice1 + dice2 == 2) {
			System.out.println("Snake Eyes");
		} else if (dice1 + dice2 == 12) {
			System.out.println("Box cars!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Dice Roller");
		
		int dice1 = getDiceRoll();
		int dice2 = getDiceRoll();
		
		String message = "Dice 1: " + dice1 + "\n" + "Dice 2: " + dice2 + "\n" + "Total: " + (dice1 + dice2);
		System.out.println(message);
		printExtraMessage(dice1, dice2);

	}

}
