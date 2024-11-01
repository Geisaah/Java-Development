package marathon.javadevelopment.introduction.javacore.eenum.test;

import marathon.javadevelopment.introduction.javacore.eenum.domain.Client;
import marathon.javadevelopment.introduction.javacore.eenum.domain.Client.PaymentType;
import marathon.javadevelopment.introduction.javacore.eenum.domain.ClientType;

import static marathon.javadevelopment.introduction.javacore.eenum.domain.Client.PaymentType.*;

public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("Weverton", ClientType.LEGAL_PERSON, DEBIT);
        Client client2 = new Client("Gerson", ClientType.PERSON_NATURAL, CREDIT);

        System.out.println(client1);
        System.out.println(client2);

    }
}
