package pl.hellopoland.dto;

import java.util.List;

public class PartnerDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public List<UserDTO> users;
  public List<SightEventDTO> sightEvents;
  public String token;
}
