package pl.hellopoland.dto;

import java.util.List;
import java.util.Set;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

public class MarketPartnerDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public List<CategoryDTO> categories;
  public ImageDTO mainImage;
  public List<String> cities;

  @Size(max = 1000)
  public String description;

  @Valid
  public LocationDTO location;
  public String email;
  public String phone;
  public List<SightDTO> sights;
  public List<SightEventDTO> sightEvents;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;

}
