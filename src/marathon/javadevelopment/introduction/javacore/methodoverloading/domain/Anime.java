package marathon.javadevelopment.introduction.javacore.methodoverloading.domain;

public class Anime {
    private String name;
    private String type;
    private int episodes;
    private String genre;


    public void init(String name, String type, int episodes){
        this.name = name;
        this.type = type;
        this.episodes = episodes;

    }
    public void init(String name, String type, int episodes, String genre){
     this.init(name, type, episodes);

        this.genre = genre;

    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.type);
        System.out.println(this.episodes);
        System.out.println(this.genre);
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return this.episodes;
    }
}
