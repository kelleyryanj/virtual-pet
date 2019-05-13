package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String gameInput;

		VirtualPet garfield = new VirtualPet();
		System.out.println("Hi, I'm Garfield the cat.");

		boolean gameLoop = true;

		while (gameLoop == true) {

			if (garfield.getHunger() > 70) {
				System.out.println("Im hungry what do you have for me to eat");
				gameInput = input.nextLine();
				if (gameInput.toLowerCase().equals("options")) {
					System.out.println("Type \"tuna\" to feed me tuna.");
					System.out.println("Type \"cat food\" to feed me cat food.");
					System.out.println("Type \"lasagana\" to feed me lasagna.");
					System.out.println("What do you have for me?");
					gameInput = input.nextLine();
					garfield.getFood(gameInput);
					System.out.println();
				}
				garfield.getFood(gameInput);
				System.out.println();
			} else if (garfield.getBathroomNeed() > 90) {
				System.out.println("I have to potty now. I'll take myself out");
				System.out.println();
				gameInput = "bathroom";
				garfield.getPotty(gameInput);

			} else if (garfield.getBoredom() > 90) {
				System.out.println("I'm bored! What do you want to play?");
				gameInput = input.nextLine();
				if (gameInput.toLowerCase().equals("options")) {
					System.out.println("Type string to play with string.");
					System.out.println("Type laser to play with a laser pointer.");
					System.out.println("Type catnip to give me catnip.");
					System.out.println("What do you want to play with?");
					gameInput = input.nextLine();
					garfield.getPlay(gameInput);
					System.out.println();
				}
				garfield.getPlay(gameInput);
				System.out.println();
			} else if (garfield.getSleepiness() > 90) {
				System.out.println("I'm tired, I'm gonna take a nap.");
				System.out.println();
				gameInput = "bed";
				garfield.getSleep(gameInput);
			}

			else {

				System.out.println("What do you want to do?");
				gameInput = input.nextLine();
				{
					if (gameInput.toLowerCase().contains("feed")) {
						System.out.println("What ya got good for me?!");
						gameInput = input.nextLine();
						if (gameInput.toLowerCase().equals("options")) {
							System.out.println("Type \"tuna\" to feed me tuna.");
							System.out.println("Type \"cat food\" to feed me cat food.");
							System.out.println("Type \"lasagana\" to feed me lasagna.");
							System.out.println("What do you have for me?");
							gameInput = input.nextLine();
							garfield.getFood(gameInput);
						} else if (gameInput.toLowerCase().equals("tuna")) {
							System.out.println("Yea, I like Tuna.");
							System.out.println();
							garfield.getFood(gameInput);
						} else if (gameInput.toLowerCase().contains("lasagna")) {
							System.out.println("Hmmm lasagna.. That's my favorite!!!!");
							System.out.println();
							garfield.getFood(gameInput);
						} else if (gameInput.toLowerCase().contains("cat food")) {
							System.out.println("Aww man, just cat food!!!!");
							System.out.println();
							garfield.getFood(gameInput);
						} else {
							System.out.println("I don't know how to do that.");
							System.out.println();

						}

					} else if (gameInput.toLowerCase().contains("bathroom")) {
						System.out.println("Ok, take me outside.");
						System.out.println();
						gameInput = "bathroom";
						garfield.getPotty(gameInput);

					} else if (gameInput.toLowerCase().contains("play")) {
						System.out.println("Ok what do you want to play?");
						gameInput = input.nextLine();
						if (gameInput.toLowerCase().equals("options")) {
							System.out.println("Type \"string\" to play with string.");
							System.out.println("Type \"laser\" to play with a laser pointer.");
							System.out.println("Type \"catnip\" to give me catnip.");
							System.out.println("What do you want to play with?");
							gameInput = input.nextLine();
							garfield.getPlay(gameInput);
						} else if (gameInput.toLowerCase().equals("string")) {
							System.out.println("Playing with string is fun.");
							gameInput = "string";
							garfield.getPlay(gameInput);
						} else if (gameInput.toLowerCase().equals("laser")) {
							System.out.println("Playing with the laser is ok.");
							gameInput = "laser";
							garfield.getPlay(gameInput);
						} else if (gameInput.toLowerCase().equals("catnip")) {
							System.out.println("CATNIP! CATNIP! CATNIP!");
							gameInput = "catnip";
							garfield.getPlay(gameInput);
						} else {
							System.out.println("I don't know how to do that.");
							System.out.println();
						}

					} else if (gameInput.toLowerCase().contains("bed")) {
						System.out.println("Ok, tuck me in please.");
						gameInput = "bed";
						garfield.getSleep(gameInput);

					} else if (gameInput.toLowerCase().equals("options")) {
						System.out.println("To play with me type \"play\".");
						System.out.println("To feed me type \"feed.");
						System.out.println("To take me to the bathroom type \"bathroom\".");
						System.out.println("To put me to bed type \"bed\".");
						System.out.println("If you want to see how I'm doing type \"status\".");
						System.out.println("If you want to quit type \"quit\".");
						System.out.println();

					} else if (gameInput.toLowerCase().equals("status")) {
						System.out.println(" My hunger is :" + garfield.getHunger());
						System.out.println(" My bathroomNeed is :" + garfield.getBathroomNeed());
						System.out.println(" My sleepiness is :" + garfield.getSleepiness());
						System.out.println(" My boredom is :" + garfield.getBoredom());
						System.out.println();

					}

					else if (gameInput.toLowerCase().contains("quit")) {
						gameLoop = false;
					} else {
						System.out.println("I don't know how to do that.");
					}
				}
			}
			garfield.tick();

		}

		System.out.println("Ok see you later!");
		System.exit(0);

		input.close();
	}
}