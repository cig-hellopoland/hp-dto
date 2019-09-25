package pl.hellopoland.dto;

import java.util.List;
import java.util.Set;

public class SightEventDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public String lead;
  public String description;
  public Float score;
  public ImageDTO mainImage;
  public List<ImageDTO> images;
  public String email;
  public String phone;
  public Integer duration;
  public LocationDTO location;
  public Boolean generalAdmission;
  public Integer minPrice;
  public List<TicketPoolDefinitionDTO> ticketPoolDefinitions;
  public List<OpeningHoursDTO> openingHours;
  public List<AgreementDTO> agreements;
  public FileDescriptorDTO pdfAttachment;
  public Boolean published;
  public Boolean blocked;
  public String partnerAffiliateCode;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;
  public Integer promotion;
  public Boolean promoted;
  public Long partnerId;
  public String partnerName;
  public Long sightId;
  public String sightName;
  public Set<CategoryDTO> categories;
  public Set<TagDTO> tags;
  public List<SightEventDTO> similar;

}
