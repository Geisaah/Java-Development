package marathon.javadevelopment.introduction.javacore.string.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String name = "Geisa Freitas ";
        name.concat(" Software Engineer");
        name.substring(0,3);
        System.out.println(name);
        StringBuilder sb = new StringBuilder("Geisa Freitas ");
        sb.append(" Software Engineer").append("Profession");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
