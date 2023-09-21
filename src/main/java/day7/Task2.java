package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player.info();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        Player player8 = new Player();
        Player.info();
        System.out.println(player1.getStamina());
        int x = player1.getStamina();
        for (int i = 0; i < x; i++) {
            player1.run();
        }
        System.out.println(player1.getStamina());
        System.out.println(Player.countPlayers);
        Player.info();
    }
}
