package pl.hellopoland.dto;

import java.util.List;
import java.util.Set;

public class SightDTO extends DTOSuperclass {

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
  public Boolean published;
  public Boolean blocked;
  public Integer minPrice;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;
  public Set<CategoryDTO> categories;
  public Set<TagDTO> tags;
  public List<SightDTO> similar;
  public Long partnerId;
  public String partnerName;

}
