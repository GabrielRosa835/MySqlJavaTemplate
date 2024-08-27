package mylibrary;

import java.util.*;

public abstract class Console_UI extends Utils {
	private static String[] options = {};
	private static Scanner input = new Scanner(System.in);
	
	public static void start() {
		print("===== START =====");
		int i = 0;
		for(String s : options) {
			print(String.format("%d -> %s", i, s));
		}
		print();
		print("Choose an option: ");
		String choice = input.nextLine();
		do {
			switch(choice) {
				case "option1":
					//code
					break;
				case "option2":
					//code
					break;
				default:
					choice = "Stay";
					break;
			};
		} while (choice.equals("Stay"));
	}
}
