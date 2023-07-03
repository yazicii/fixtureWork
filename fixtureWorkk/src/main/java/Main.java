import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("TRABZONSPOR");
        teams.add("BEŞİKTAŞ");
        teams.add("GALATASARAY");
        teams.add("FENERBAHÇE");
        teams.add("BAŞAKŞEHİR");
        // Add more teams if needed

        FixtureGenerator fixtureGenerator = new FixtureGenerator(teams);
        List<String> fixtures = fixtureGenerator.generateFixtures();

        for (String fixture : fixtures) {
            System.out.println(fixture);
        }
    }
}