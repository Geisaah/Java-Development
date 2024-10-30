package marathon.javadevelopment.introduction.javacore.finalmodifier.domain;

public class Purchase {
    private String name;

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
