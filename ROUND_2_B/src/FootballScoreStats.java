
public class FootballScoreStats {

	private final GameData footballData;

	public FootballScoreStats(GameData gameData) {
		footballData = gameData;
	}

	public int teamTotal(String teamName) {
		int total = 0;
		Game[] played = footballData.getAllPlayed();
		for (Game game : played) {
			total += game.getTeamScore(teamName);
		}
		return total;
	}

}
