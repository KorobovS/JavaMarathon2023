package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    static int countPlayers;

    public int getStamina() {
        return this.stamina;
    }

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(10) + 90;
        if (Player.countPlayers < 6) {
            Player.countPlayers++;
        }
    }

    public void run() {
        if (this.stamina == Player.MIN_STAMINA) {
            Player.countPlayers--;
            return;
        }
        this.stamina--;
    }

    public static void info() {
        switch (Player.countPlayers) {
            case 6:
                System.out.println("На поле нет свободных мест");
                break;
            case 5:
                System.out.println("“Команды неполные. На поле еще есть одно\n" +
                        "свободное место");
                break;
            case 4:
                System.out.println("“Команды неполные. На поле еще есть два\n" +
                        "свободных места");
                break;
            case 3:
                System.out.println("“Команды неполные. На поле еще есть три\n" +
                        "свободных места");
                break;
            case 2:
                System.out.println("“Команды неполные. На поле еще есть четыре\n" +
                        "свободных места");
                break;
            case 1:
                System.out.println("“Команды неполные. На поле еще есть пять\n" +
                        "свободных мест");
                break;
            case 0:
                System.out.println("“Команды неполные. На поле еще есть шесть\n" +
                        "свободных мест");
                break;
        }
    }
}
