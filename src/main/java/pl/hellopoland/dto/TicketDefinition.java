package pl.hellopoland.dto;

import java.util.Date;

public class TicketDefinition {

  public Long id;
  public String name;
  public Integer availableTicketsNumber;
  public Integer price;
  public boolean predefinedDate;
  public Date date;
  public DateType dateType;
  public Long sightEventId;

}
