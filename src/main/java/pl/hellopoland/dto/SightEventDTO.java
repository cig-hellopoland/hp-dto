package pl.hellopoland.dto;

import java.util.List;

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
  public boolean published;
  public boolean blocked;
}
