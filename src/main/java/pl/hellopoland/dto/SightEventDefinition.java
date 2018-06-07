package pl.hellopoland.dto;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;

public class SightEventDefinition {
  public Long id;
  public String name;
  public String lead;
  public String description;
  public String mainImageUrl;
  public String email;
  public String phone;
  public Integer duration;
  public Integer availableTicketsNumber;
  public SightEventDefinition.Location location;
  public Date date;
  public Collection<SightEventDefinition.TicketSightEventDefinition> tickets;
  public Collection<SightEventDefinition.OpeningHours> openingHours;
  public Collection<SightEventDefinition.Agreement> agreements;

  public class Location {
    public Double latitude;
    public Double longitude;
    public String street;
    public String zipCode;
    public String city;
    public String country;
  }

  public class TicketSightEventDefinition {
    public Long id;
    public String name;
    public Integer price;
    public boolean predefinedDate;
    public Date date;
    public SightEventDefinition.DateType dateType;
    public Long sightEventId;
  }

  public enum DateType {
    UNDEFINED, DATE, DATE_TIME
  }

  public class OpeningHours {
    public Integer day;
    public LocalTime openTime;
    public LocalTime closeTime;
  }

  public class Agreement {
    public String name;
    public String url;
  }
}
