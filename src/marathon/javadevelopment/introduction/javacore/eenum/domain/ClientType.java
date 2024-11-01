package marathon.javadevelopment.introduction.javacore.eenum.domain;

public enum ClientType {
    PERSON_NATURAL(2, "PERSON_NATURAL"),
    LEGAL_PERSON(1, "LEGAL_PERSON");

    private final int value;
    private String reportName;

    ClientType(int value, String reportName) {
        this.value = value;
        this.reportName = reportName;
    }

    public static ClientType tipeClientForNameReport(String reportName){
        for (ClientType clientType : values()) {
            if(clientType.getReportName().equals(reportName)){
                return clientType;
            }
        }
        return null;

    }

    public String getReportName() {
        return reportName;
    }

    public int getValue() {
        return value;
    }
}
