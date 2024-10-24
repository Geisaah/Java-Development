package marathon.javadevelopment.introduction.javacore.initializationblock.test;

import marathon.javadevelopment.introduction.javacore.initializationblock.domain.Anime;

public class AnimeTest{
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        for (int episode : anime.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }

}


