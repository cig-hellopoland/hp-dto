package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;

public class SightEventDefinition {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public Image mainImage;
  public String email;
  public String phone;
  public Integer duration;
  public Integer availableTicketsNumber;
  public Location location;
  public Date date;
  public List<TicketDefinition> tickets;
  public List<OpeningHours> openingHours;
  public List<Agreement> agreements;
  public Long sightId;
}
