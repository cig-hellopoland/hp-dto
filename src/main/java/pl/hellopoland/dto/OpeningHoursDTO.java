package pl.hellopoland.dto;

import java.time.LocalTime;

public class OpeningHoursDTO {
  public SightEventDTO sightEvent;
  public SightDTO sight;
  public Integer day;
  public LocalTime openTime;
  public LocalTime closeTime;
}
