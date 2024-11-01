package marathon.javadevelopment.introduction.javacore.eenum.domain;

public class Client {
    public enum PaymentType{
        DEBIT, CREDIT
    }
    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType clientType, PaymentType paymentType) {
        this.name = name;
        this.clientType = clientType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientType=" + clientType.getValue() +
                ", clientType=" + clientType.getReportName() +
                ", paymentType=" + paymentType +
                '}';
    }
}
