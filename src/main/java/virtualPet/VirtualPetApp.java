package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String gameInput;
		String gameOptions;

		VirtualPet garfield = new VirtualPet();
		System.out.println("Hi, I'm Garfield the cat.");

		boolean gameLoop = true;

		while (gameLoop == true) {

			if (garfield.getHunger() > 70) {
				System.out.println("Im hungry what do you have for me to eat");
				gameInput = input.nextLine();
				garfield.getFood(gameInput);
			} else if (garfield.getBathroomNeed() > 70) {
				System.out.println("I have to potty now");
				gameInput = input.nextLine();
				garfield.getPotty(gameInput);
			}

			System.out.println("What do you want to do?");
			gameOptions = input.nextLine();
			{
				if (gameOptions.toLowerCase().contains("feed")) {
					System.out.println("What ya got good for me?!");
					gameInput = input.nextLine();
					garfield.getFood(gameInput);
					System.out.println(garfield.getFood());

				} else if (gameOptions.toLowerCase().contains("bathroom")) {
					System.out.println("Ok, take me outside.");
					gameInput = "bathroom";
					garfield.getPotty(gameInput);
					System.out.println(garfield.getBathroomNeed());

				} else if (gameOptions.toLowerCase().contains("play")) {
					System.out.println("Ok what do you want to play?");
					gameInput = input.nextLine();
					garfield.getPlay(gameInput);
					System.out.println(garfield.getBoredom());
					System.out.println(garfield.getSleepiness());

				} else if (gameOptions.toLowerCase().contains("bed")) {
					System.out.println("Ok, tuck me in please.");
					gameInput = "bed";
					garfield.getSleep(gameInput);
					System.out.println(garfield.getSleepiness());
				}

			}

		} input.close();
	}
}