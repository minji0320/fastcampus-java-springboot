package ch16.game;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    void play(int count) {
        level.go(count);
    }
}
