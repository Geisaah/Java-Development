package marathon.javadevelopment.introduction.javacore.eenum.domain;

public class Client {
    private String name;
    private String type;
    public static final String PERSON_NATURAL = "PERSON_NATURAL";
    public static final String LEGAL_PERSON = "LEGAL_PERSON";


    public Client(String name, String type) {
        if (!type.equals(PERSON_NATURAL) == false && !type.equals(LEGAL_PERSON) == false){
            return;
        }
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
