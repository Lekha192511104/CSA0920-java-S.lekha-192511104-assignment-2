import java.util.*;

class Team {
    String name;
    int points;
    int goalDiff;

    Team(String name, int points, int goalDiff) {
        this.name = name;
        this.points = points;
        this.goalDiff = goalDiff;
    }

    public String toString() {
        return name + "(" + points + "," + goalDiff + ")";
    }
}

class Leaderboard<T> {
    List<T> rank(List<T> items, Comparator<T> order) {
        List<T> copy = new ArrayList<>(items);
        copy.sort(order);
        return copy;
    }
}

public class LeaderboardDemo {
    public static void main(String[] args) {
        List<Team> teams = Arrays.asList(
            new Team("Cobras", 6, 1),
            new Team("Panthers", 9, 4),
            new Team("Bisons", 9, 4),
            new Team("Eagles", 9, 6)
        );

        Comparator<Team> byRank =
            Comparator.comparingInt((Team t) -> t.points).reversed()
            .thenComparing(
                Comparator.comparingInt((Team t) -> t.goalDiff).reversed()
            )
            .thenComparing(t -> t.name);

        Leaderboard<Team> leaderboard = new Leaderboard<>();

        System.out.println(leaderboard.rank(teams, byRank));
    }
}
