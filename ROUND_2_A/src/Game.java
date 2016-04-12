
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

	public String getHomeTeam() {
		return homeTeam;
	}

	public int getHomeTeamScore() {
		return homeTeamScore;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public int getAwayTeamScore() {
		return awayTeamScore;
	}

}
