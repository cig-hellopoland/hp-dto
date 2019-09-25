package pl.hellopoland.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public class PartnerDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public List<UserDTO> users;
  public List<SightEventDTO> sightEvents;
  public String token;
  public String email;
  public String description;
  public String defaultLanguage;
  public Set<String> availableLanguageVersions;
  public String language;
  public Integer p24MerchantId;
  public BigDecimal commission;
  public String password;
  public String affiliateCode;
  public Boolean affiliation;
  public LocationDTO location;
  public String bankAccount;
  public Integer businessType;
  public ContactPersonDTO contactPerson;
  public LocationDTO correspondenceAddress;
  public String invoiceEmail;
  public String krs;
  public String taxNumber;
  public String socialNumber;
  public String phone;
  public String regon;
  public List<PartnerRepresentativeDTO> representatives;
  public String servicesDescription;
  public String shopUrl;
  public ContactPersonDTO technicalContact;
  public boolean skipP24;

}
