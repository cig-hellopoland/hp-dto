package pl.hellopoland.dto;

import java.util.List;

public class SightEventDTO {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public Float score;
  public ImageDTO mainImage;
  public String email;
  public String phone;
  public Integer duration;
  public LocationDTO location;
  public Boolean generalAdmission;
  public Integer minPrice;
  public List<TicketDefinitionDTO> ticketDefinitions;
  public List<TicketPoolDefinitionDTO> ticketPoolDefinitions;
  public List<TicketPoolDTO> ticketPools;
  public Long sightId;

}
