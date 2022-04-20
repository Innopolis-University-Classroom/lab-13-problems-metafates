package fifa;

import game.Game;
import observer.Observer;
import user.User;

public class FIFA {
    private final Observer<User, Game> gameManger = new Observer<>();

    public void addSubscriber(User user) {
        gameManger.subscribe(user);
    }

    public void addGame(Game game) {
        gameManger.notify(game);
    }
}

