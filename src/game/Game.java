package game;

import teams.Team;
import wrappers.Pair;

import java.time.LocalDate;

public class Game {
    private final Pair<Team> teams;
    private final LocalDate date;

    public Game(final LocalDate date, Pair<Team> teams) {
        this.teams = teams;
        this.date = date;
    }

    public Pair<Team> getTeams() {
        return teams;
    }

    public LocalDate getDate() {
        return date;
    }
}
