package pl.hellopoland.dto;

public class EmailSendingReportDTO extends DTOSuperclass {
  public String[] validSentAddresses;
  public String[] validUnsentAddresses;
  public String[] invalidAddresses;
}
