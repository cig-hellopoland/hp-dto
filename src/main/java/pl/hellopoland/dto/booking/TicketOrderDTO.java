package pl.hellopoland.dto.booking;

import java.util.Date;
import pl.hellopoland.dto.DTOSuperclass;

public class TicketOrderDTO extends DTOSuperclass {

  public Long ticketDefinitionId;

  public Long ticketPoolDefinitionId;

  public Long numberOfTickets;

  public Date date;
}
