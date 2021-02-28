package day7;

public class Player {

    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public static void info() {
        if (countPlayers >= 0 && countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + countPlayers + " свободных мест");
        } else if (countPlayers <= 6) {
            System.out.println("На поле нет свободных мест");
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (this.stamina <= MIN_STAMINA) {
            return;
        }

        this.stamina--;

        if (this.stamina <= MIN_STAMINA) {
            countPlayers--;
        }
    }
}
