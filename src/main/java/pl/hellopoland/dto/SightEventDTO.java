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
  public Long sightId;
  public List<OpeningHoursDTO> openingHours;
  public List<AgreementDTO> agreements;
  public FileDescriptorDTO pdfAttachment;
  public Boolean published;
  public Boolean blocked;
  public String partnerAffiliateCode;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;
}
