package marathon.javadevelopment.introduction.javacore.constructor;


import marathon.javadevelopment.introduction.javacore.constructor.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Maya","TV", 12, "Action", "Production A");
        anime.print();

    }
}
