package marathon.javadevelopment.introduction.javacore.association.test;

import marathon.javadevelopment.introduction.javacore.association.domain.Player;
import marathon.javadevelopment.introduction.javacore.association.domain.Team;

public class PlayerTest2 {
    public static void main(String[] args) {


    Player player = new Player("Cafu");
    Team team = new Team("Brazil");
    Player[] players = {player};

    player.setTeam(team);
    team.setPlayers(players);

        System.out.println("-----------------Player");
        player.print();
        System.out.println("-----------------Team");
        team.print();

    }
}
