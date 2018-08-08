package pl.hellopoland.dto.booking;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import pl.hellopoland.dto.StatusDTO;

public class TicketDTO {

  public Long id;

  public String name;

  public Integer price;

  public Date date;

  public StatusDTO status;

  public String serialNumber;

  public ByteArrayOutputStream qrCode;

  public Long ticketDefinitionId;

  public Long bookingId;

}
