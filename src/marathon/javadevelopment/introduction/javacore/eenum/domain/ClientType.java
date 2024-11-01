package marathon.javadevelopment.introduction.javacore.eenum.domain;

public enum ClientType {
    PERSON_NATURAL(2, "Person Natural"),
    LEGAL_PERSON(1, "Legal Person");

    private final int value;
    private String reportName;

    ClientType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}
