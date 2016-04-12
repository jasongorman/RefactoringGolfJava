
public class Game {

	private String homeTeam;
	private int homeTeamScore;
	private String awayTeam;
	private int awayTeamScore;

	public Game(String homeTeam, int homeTeamScore, String awayTeam, int awayTeamScore) {
		this.homeTeam = homeTeam;
		this.homeTeamScore = homeTeamScore;
		this.awayTeam = awayTeam;
		this.awayTeamScore = awayTeamScore;
	}

	int getTeamScore(String teamName) {
		int total = 0;
		if(homeTeam.equals(teamName)){
			total = homeTeamScore;
		}
		if(awayTeam.equals(teamName)){
			total = awayTeamScore;
		}
		return total;
	}

}
