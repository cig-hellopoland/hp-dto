package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;

public class TicketPoolDefinitionDTO {

  public Long id;

  public String name;

  public Integer availableTicketsNumber;

  public Boolean cyclicalPool;

  public FrequencyDataDTO frequencyData;

  public Date startDate;

  public Date endDate;

  public Date entryStartDate;

  public Date entryEndDate;

  public DateTypeDTO dateType;

  public Boolean predefinedDate;

  public Date date;

  public Long sightEventId;

  public List<TicketDefinitionDTO> ticketDefinitions;

}
