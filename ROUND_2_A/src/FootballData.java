
public class FootballData {

	public static Game[] getAllPlayed() {
		Game[] played = new Game[3];
		played[0] = new Game("Liverpool", 2, "Everton", 0);
		played[1] = new Game("Aston Villa", 1, "Liverpool", 1);
		played[2] = new Game("Liverpool", 3, "West Ham", 1);
		return played;
	}

}
