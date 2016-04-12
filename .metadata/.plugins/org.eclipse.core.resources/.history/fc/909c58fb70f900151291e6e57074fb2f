
public class FootballScoreStats {

	public int teamTotal(String teamName) {
		int total = 0;
		Game[] played = FootballData.getAllPlayed();
		for (Game game : played) {
			if(game.getHomeTeam().equals(teamName)){
				total += game.getHomeTeamScore();
			}
			if(game.getAwayTeam().equals(teamName)){
				total += game.getAwayTeamScore();
			}
		}
		return total;
	}

}
