package marathon.javadevelopment.introduction.javacore.eenum.test;

import marathon.javadevelopment.introduction.javacore.eenum.domain.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Weverton", "Natural Person");
        Client client1 = new Client("Weverton", "Legal Person");
        Client client2 = new Client("Weverton", "NATURAL PERSON");
        Client client3 = new Client("Weverton", "LEGAL PERSON");
        System.out.println(client);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
    }
}
