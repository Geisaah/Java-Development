package marathon.javadevelopment.introduction.javacore.eenum.domain;

public class Client {
    private String name;
    private ClientType clientType;

    public Client(String name, ClientType clientType) {
        this.name = name;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }
    // private String type;
   // public static final String PERSON_NATURAL = "PERSON_NATURAL";
   // public static final String LEGAL_PERSON = "LEGAL_PERSON";


}
