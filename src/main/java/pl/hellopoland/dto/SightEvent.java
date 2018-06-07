package pl.hellopoland.dto;

import java.util.Collection;
import java.util.Date;

public class SightEvent {

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

  public Collection<Ticket> tickets;
  public Collection<OpeningHours> openingHours;
  public Collection<Agreement> agreements;

}
