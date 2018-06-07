package pl.hellopoland.dto;

import java.util.Date;

public class Ticket {

  public Long id;
  public String name;
  public Integer price;
  public boolean predefinedDate;
  public Date date;
  public DateType dateType;
  public Long sightEventId;

  public enum DateType {
    UNDEFINED, DATE, DATE_TIME
  }
}
