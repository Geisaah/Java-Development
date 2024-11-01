package marathon.javadevelopment.introduction.javacore.eenum.test;

import marathon.javadevelopment.introduction.javacore.eenum.domain.Client;
import marathon.javadevelopment.introduction.javacore.eenum.domain.ClientType;
import marathon.javadevelopment.introduction.javacore.eenum.domain.PaymentType;

import static marathon.javadevelopment.introduction.javacore.eenum.domain.PaymentType.CREDIT;
import static marathon.javadevelopment.introduction.javacore.eenum.domain.PaymentType.DEBIT;


public class ClientTest {
    public static void main(String[] args) {
        Client client1 = new Client("Weverton", ClientType.LEGAL_PERSON, DEBIT);
        Client client2 = new Client("Gerson", ClientType.PERSON_NATURAL, CREDIT);

        System.out.println(client1);
        System.out.println(client2);
        System.out.println(DEBIT.calculateDiscount(100));
        ClientType clientType = ClientType.valueOf("PERSON_NATURAL");
        System.out.println(clientType);
        ClientType clientType2 = ClientType.tipeClientForNameReport("LEGAL_PERSON");
        System.out.println(clientType2);

    }
}
