package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;
import pl.hellopoland.dto.booking.TicketDTO;

public class TicketPoolDTO {

  public Long id;

  public String name;

  public Integer availableTicketsNumber;

  public Date startDate;

  public Date endDate;

  public Date entryStartDate;

  public Date entryEndDate;

  public List<TicketDTO> tickets;

  public Integer boughtTicketNumber;

  public Integer totalTicketsNumber;

}
