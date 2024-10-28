package marathon.javadevelopment.introduction.javacore.association.test;

import marathon.javadevelopment.introduction.javacore.association.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Player player2 = new Player("Romario");
        Player player3 = new Player("Cafú");
        Player[] players = new Player[]{player1, player2, player3};
        for (Player player : players) {
            player.print();

        }

    }
}
