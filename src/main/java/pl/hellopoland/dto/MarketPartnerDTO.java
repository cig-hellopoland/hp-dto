package pl.hellopoland.dto;

import java.util.List;
import java.util.Set;

public class MarketPartnerDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public List<CategoryDTO> categories;
  public ImageDTO mainImage;
  public List<String> cities;
  public String description;
  public LocationDTO location;
  public String email;
  public String phone;
  public List<SightDTO> sights;
  public List<SightEventDTO> sightEvents;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;

}
