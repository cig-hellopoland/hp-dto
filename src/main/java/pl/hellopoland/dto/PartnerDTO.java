package pl.hellopoland.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;

public class PartnerDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public List<UserDTO> users;
  public List<SightEventDTO> sightEvents;
  public String token;
  public String email;

  @Size(max = 1000)
  public String description;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;
  public Integer p24MerchantId;
  public BigDecimal commission;
  public String password;
  public String affiliateCode;
  public Boolean affiliation;

  @Valid
  public LocationDTO location;
  public String bankAccount;
  public ImageDTO mainImage;
  public Integer businessType;
  public ContactPersonDTO contactPerson;

  @Valid
  public LocationDTO correspondenceAddress;
  public String invoiceEmail;
  public String krs;
  public String taxNumber;
  public String socialNumber;
  public String phone;
  public String regon;
  public List<PartnerRepresentativeDTO> representatives;

  @Size(max = 1000)
  public String servicesDescription;
  public String shopUrl;
  public ContactPersonDTO technicalContact;
  public boolean skipP24;
  public boolean blocked;

}
