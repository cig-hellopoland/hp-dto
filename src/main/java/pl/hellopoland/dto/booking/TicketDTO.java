package pl.hellopoland.dto.booking;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import pl.hellopoland.dto.StatusDTO;
import pl.hellopoland.dto.TicketDefinitionDTO;

public class TicketDTO {

  public Long id;

  public String name;

  public Integer price;

  public Date date;

  public StatusDTO status;

  public Long ticketDefinitionId;

  public String serialNumber;

  public ByteArrayOutputStream qrCode;

  public BookingDTO booking;

  public TicketDefinitionDTO ticketDefinition;
}
