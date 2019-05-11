package virtualPet;

public class VirtualPet {

	private int hunger = 50;
	private int bathroomNeed = 50;
	private int sleepiness = 50;
	private int boredom = 50;
	private String food;
	private String potty;
	private String play;
	private String sleep;

	public int getHunger() {
		return hunger;
	}

	public void getHunger(int hunger) {
		this.hunger = hunger;

	}

	public int getBathroomNeed() {
		return bathroomNeed;
	}

	public void getBathroomNeed(int bathroomNeed) {
		this.bathroomNeed = bathroomNeed;

	}

	public int getBoredom() {
		return boredom;
	}

	public void getBoredom(int boredom) {
		this.boredom = boredom;
		if (boredom > 100) {
			boredom = 100;
		} else if (boredom < 0) {
			boredom = 0;
		}

	}

	public int getSleepiness() {
		return sleepiness;
	}

	public void getSleepiness(int sleepiness) {
		this.sleepiness = sleepiness;
		if (sleepiness > 100) {
			sleepiness = 100;
		} else if (sleepiness < 0) {
			sleepiness = 0;
		}
	}

	public String getFood() {
		return food;
	}

	public void getFood(String food) {
		this.food = food;
		if (food.toLowerCase().contains("cat food")) {
			bathroomNeed += 20;
			hunger -= 20;
		} else if (food.toLowerCase().contains("tuna")) {
			bathroomNeed += 30;
			hunger -= 30;
		} else if (food.toLowerCase().contains("lasagna")) {
			bathroomNeed = 100;
			hunger = 0;
		}
		if (bathroomNeed > 100) {
			bathroomNeed = 100;
		}
		if (bathroomNeed < 0) {
			bathroomNeed = 0;
		}
	}

	public String getPotty() {
		return potty;
	}

	public void getPotty(String potty) {
		this.potty = potty;
		if (potty.toLowerCase().equals("bathroom")) {
			bathroomNeed -= 70;
		}
	}

	public String getPlay() {
		return play;
	}

	public void getPlay(String play) {
		this.play = play;

		if (play.toLowerCase().contains("string")) {
			sleepiness += 20;
			boredom -= 20;
		} else if (play.toLowerCase().contains("laser")) {
			sleepiness += 30;
			boredom -= 30;
		} else if (play.toLowerCase().contains("catnip")) {
			sleepiness = 100;
			boredom = 0;
		}
		if (sleepiness > 100) {
			sleepiness = 100;
		} else if (sleepiness < 0) {
			sleepiness = 0;
		}
		if (boredom > 100) {
			boredom = 100;
		} else if (boredom < 0) {
			boredom = 0;
		}

	}

	public String getSleep() {
		return sleep;
	}

	public void getSleep(String sleep) {
		this.sleep = sleep;
		if (sleep.toLowerCase().contains("bed")) {
			sleepiness = 0;

		}

	}

	public void tick() {
		hunger = hunger += 10;
		sleepiness = sleepiness += 10;
		boredom = boredom += 10;
		bathroomNeed += 10;
	}
}
