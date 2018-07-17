package pl.hellopoland.dto.booking;

import java.util.Date;
import java.util.List;
import javax.json.bind.annotation.JsonbDateFormat;
import pl.hellopoland.dto.StatusDTO;

public class BookingDTO {

  public Long id;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date date;

  public String customerName;

  public String customerEmail;

  public StatusDTO status;

  public String serialNumber;

  public List<TicketDTO> tickets;

  public List<TicketOrderDTO> ticketBookings;
}
