package pl.hellopoland.dto;

import jakarta.validation.constraints.Size;

public class LocationDTO extends DTOSuperclass {

  public Double latitude;
  public Double longitude;
  public String street;
  public String zipCode;
  public String city;
  public String country;

  @Size(max = 1000)
  public String directions;

  public String commune;      // gmina
  public String county;       // powiat
  public String voivodeship;  // wojewodztwo

}
