
public class MyConsole extends Console{
	
	@Override
	public String getString(String prompt) {
		String userInput = "";

		while (userInput.equals("")) {
			System.out.print(prompt);
			userInput = sc.nextLine();

			if (userInput.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			}
		}

		System.err.println("Leaving getString with " + userInput);

		return userInput;
	}

}
