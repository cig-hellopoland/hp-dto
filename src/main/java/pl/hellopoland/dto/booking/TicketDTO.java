package pl.hellopoland.dto.booking;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import javax.json.bind.annotation.JsonbDateFormat;
import pl.hellopoland.dto.Status;
import pl.hellopoland.dto.TicketDefinitionDTO;

public class TicketDTO {

  public Long id;

  public String name;

  public Integer price;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date date;

  public Status status;

  public Long ticketDefinitionId;

  public String serialNumber;

  public ByteArrayOutputStream qrCode;

  public BookingDTO booking;

  public TicketDefinitionDTO ticketDefinition;
}
