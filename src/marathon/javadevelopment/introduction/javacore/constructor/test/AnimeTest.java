package marathon.javadevelopment.introduction.javacore.constructor.test;

import marathon.javadevelopment.introduction.javacore.methodoverloading.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Friends","TV", 12, "Action");
        anime.print();
    }
}
