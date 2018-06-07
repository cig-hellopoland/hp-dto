package pl.hellopoland.dto;

import java.util.Collection;
import java.util.Date;

public class SightEventDefinition {
  public Long id;
  public String name;
  public String lead;
  public String description;
  public String mainImageUrl;
  public String email;
  public String phone;
  public Integer duration;
  public Integer availableTicketsNumber;
  public Location location;
  public Date date;
  public Collection<TicketDefinition> tickets;
  public Collection<OpeningHours> openingHours;
  public Collection<Agreement> agreements;
}
