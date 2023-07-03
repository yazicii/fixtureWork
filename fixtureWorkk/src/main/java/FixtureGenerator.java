import java.util.ArrayList;
import java.util.List;

public class FixtureGenerator {
    private List<String> teams;

    public FixtureGenerator(List<String> teams) {
        this.teams = teams;
        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
    }

    public List<String> generateFixtures() {
        List<String> fixtures = new ArrayList<>();

        int numTeams = teams.size();
        int numRounds = numTeams - 1;
        int matchesPerRound = numTeams / 2;

        for (int round = 0; round < numRounds; round++) {
            fixtures.add("Round " + (round + 1));
            for (int match = 0; match < matchesPerRound; match++) {
                int homeIndex = (round + match) % (numTeams - 1);
                int awayIndex = (numTeams - 1 - match + round) % (numTeams - 1);
                if (match == 0) {
                    awayIndex = numTeams - 1;
                }

                String homeTeam = teams.get(homeIndex);
                String awayTeam = teams.get(awayIndex);

                fixtures.add(homeTeam + " vs " + awayTeam);
            }
        }

        return fixtures;
    }

}
