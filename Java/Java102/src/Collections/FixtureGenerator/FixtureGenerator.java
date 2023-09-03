package Collections.FixtureGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {

    public static void main(String[] args) {
        String[] team = {"Galatasaray", "Fenerbahçe", "Beşiktaş", "Trabzonspor", "Bursaspor", "Alanyaspor", "Gaziantep FK", "Kasımpaşa", "Hatayspor", "Antalyaspor", "Sivasspor", "Kayserispor", "Rizespor", "Ankaragücü", "Gençlerbirliği", "Malatyaspor", "Göztepe", "Erzurumspor", "Konyaspor", "Denizlispor"};

        List<String> teams = new ArrayList<>();
        for(String s:team){
            teams.add(s);
        }

        if(teams.size() % 2 == 1){
            teams.add("Bay");
        }

        Collections.shuffle(teams);
        Collections.shuffle(teams);

        int rounds = teams.size() - 1;

        List<String> matchList = new ArrayList<>();

        for (int round = 1; round <= rounds * 2; round++) {
            if (round <= rounds) {
                generateHomeMatches(teams, matchList);
            } else {
                generateAwayMatches(teams, matchList);
            }
            rotateTeams(teams);
        }

        printMatches(matchList, teams.size());
    }

    public static void generateHomeMatches(List<String> teams, List<String> matchList) {
        int halfSize = teams.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            String team1 = teams.get(i);
            String team2 = teams.get(teams.size() - 1 - i);
            matchList.add(team1 + " vs " + team2);
        }
    }

    public static void generateAwayMatches(List<String> teams, List<String> matchList) {
        int halfSize = teams.size() / 2;
        for (int i = halfSize - 1; i >= 0; i--) {
            String team1 = teams.get(teams.size() - 1 - i);
            String team2 = teams.get(i);
            matchList.add(team1 + " vs " + team2);
        }
    }

    public static void rotateTeams(List<String> teams) {
        String lastTeam = teams.remove(teams.size() - 1);
        teams.add(1, lastTeam);
    }

    public static void printMatches(List<String> matchList, int numberOfTeams) {
        int week = 1;
        int matchesPerWeek = numberOfTeams / 2;
        for (int i = 0; i < matchList.size(); i += matchesPerWeek) {
            System.out.println("############################################");
            System.out.println("------------------" + week + ". Week-------------------");
            for (int j = 0; j < matchesPerWeek; j++) {
                String match = matchList.get(i + j);
                String[] parts = match.split(" vs ");
                System.out.println("\t\t  "+parts[0] + " - " + parts[1]);
            }
            System.out.println("--------------------------------------------");
            System.out.println("############################################");
            week++;
        }
    }
}
