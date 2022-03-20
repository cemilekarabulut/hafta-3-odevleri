import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter team number: ");
        int teamNum = scanner.nextInt();

        List<String> teams = new ArrayList<>();

        for (int i = 0; i < teamNum; i++) {
            String team = scanner.next();
            teams.add(team);
        }

        if (teamNum % 2 != 0) {
            teams.add("Pass");
            teamNum++;
        }

        int roundNum = (teamNum - 1) * 2;


        HashMap<String, List<String>> playedTeams = new HashMap<>();
        for (String team : teams) {
            List<String> others = new ArrayList<>(teams.stream().filter(t -> !t.equals(team)).toList());
            playedTeams.put(team, others);
        }
        List<String> houseTeams = new ArrayList<>();
        List<String> opponentTeams = new ArrayList<>();
        List<String> temp = new ArrayList<>(teams);
        for (int j = 0; j < teamNum / 2; j++) {
            int randomNum = (int) (Math.random() * temp.size());
            houseTeams.add(temp.get(randomNum));
            temp.remove(teams.get(randomNum));
        }
        for (String house : houseTeams) {
            List<String> options = playedTeams.get(house).stream().filter(t -> !houseTeams.contains(t)).toList();
            int randomNum = (int) (Math.random() * options.size());
            String opponentTeam = options.get(randomNum);
            opponentTeams.add(opponentTeam);
            List<String> keys = new ArrayList<>(playedTeams.keySet());
            for (String x : keys) {
                playedTeams.get(x).remove(opponentTeam);
            }

        }
        System.out.println("Round 1");
        for (int j = 0; j < teamNum / 2; j++) {
            System.out.println(houseTeams.get(j) + " vs " + opponentTeams.get(j));
        }
    }
}
