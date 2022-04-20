import fifa.FIFA;
import game.Game;
import teams.Team;
import user.User;
import wrappers.Pair;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FIFA fifa = new FIFA();

        User userA = User.register("username", "123");
        User userB = User.register("userrr", "123");

        Game game = new Game(LocalDate.now(), new Pair<>(new Team("team1"), new Team("team2")));

        fifa.addSubscriber(userA);
        fifa.addSubscriber(userB);

        fifa.addGame(game);
    }
}
