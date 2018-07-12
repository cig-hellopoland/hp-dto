package pl.hellopoland.dto;

import java.util.List;

public class SightDTO {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public ImageDTO mainImage;
  public String email;
  public String phone;
  public Boolean generalAdmission;
  public LocationDTO location;
  public List<SightEventDTO> sightEvents;

}
