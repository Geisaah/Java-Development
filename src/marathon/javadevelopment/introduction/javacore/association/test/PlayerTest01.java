package marathon.javadevelopment.introduction.javacore.association.test;

import marathon.javadevelopment.introduction.javacore.association.domain.Player;
import marathon.javadevelopment.introduction.javacore.association.domain.Team;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player player1 = new Player("Pelé");
        Team team = new Team("Team Brazilian");

        player1.setTeam(team);
        player1.print();
    }
}
