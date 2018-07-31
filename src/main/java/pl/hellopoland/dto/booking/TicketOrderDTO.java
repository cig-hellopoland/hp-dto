package pl.hellopoland.dto.booking;

import java.util.Date;
import javax.json.bind.annotation.JsonbDateFormat;

public class TicketOrderDTO {

  public Long ticketDefinitionId;

  public Long ticketPoolDefinitionId;

  public Long ticketPoolId;

  public Long numberOfTickets;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss'Z'")
  public Date date;
}
