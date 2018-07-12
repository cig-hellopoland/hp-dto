package pl.hellopoland.dto;

import java.util.List;

public class SightEventDTO {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public ImageDTO mainImage;
  public String email;
  public String phone;
  public Integer duration;
  public LocationDTO location;
  public Boolean generalAdmission;
  public List<TicketDefinitionDTO> ticketDefinitions;
  public Long sightId;
}
