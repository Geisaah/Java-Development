package marathon.javadevelopment.introduction.javacore.eenum.test;

import marathon.javadevelopment.introduction.javacore.eenum.domain.Client;
import marathon.javadevelopment.introduction.javacore.eenum.domain.ClientType;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Weverton", ClientType.LEGAL_PERSON);
        Client client1 = new Client("Weverton", ClientType.LEGAL_PERSON);
        Client client2 = new Client("Weverton", ClientType.PERSON_NATURAL);
        Client client3 = new Client("Weverton", ClientType.PERSON_NATURAL);
        System.out.println(client);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
    }
}
