package pl.hellopoland.dto;

import java.util.List;

public class Sight {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public Image mainImage;
  public String email;
  public String phone;
  public boolean generalAdmission;
  public Location location;
  public List<SightEvent> sightEvents;

}
