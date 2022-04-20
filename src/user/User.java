package user;

import game.Game;
import observer.Updateable;

public class User implements Updateable<Game> {
    private final String name;
    private final String password;

    private User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static User register(String name, String password) {
        return new User(name, password);
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    private void sendNotification(String message) {
        System.out.println(message);
    }

    @Override
    public void update(Game game) {
        sendNotification(String.format("%s, game %s added\n", getName(), game));
    }
}
