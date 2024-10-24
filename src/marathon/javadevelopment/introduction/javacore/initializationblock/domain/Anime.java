package marathon.javadevelopment.introduction.javacore.initializationblock.domain;

public class Anime {
    private String name;
    private int[] episodes;

    {
        System.out.println("inside the initialization block");
        episodes = new int[100];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i+1;
        }
    }

    public Anime(String name) {
        this.name = name;
    }

    public Anime() {
        for (int episode : this.episodes) {
            System.out.print(episode + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int[] getEpisodes() {
        return episodes;
    }
}

