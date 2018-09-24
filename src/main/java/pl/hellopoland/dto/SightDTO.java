package pl.hellopoland.dto;

import java.util.List;

public class SightDTO {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public Float score;
  public ImageDTO mainImage;
  public List<ImageDTO> images;
  public String email;
  public String phone;
  public Boolean generalAdmission;
  public LocationDTO location;
  public List<SightEventDTO> sightEvents;
  public List<OpeningHoursDTO> openingHours;
  public List<AgreementDTO> agreements;
}
