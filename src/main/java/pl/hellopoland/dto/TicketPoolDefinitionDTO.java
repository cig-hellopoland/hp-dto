package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;
import javax.json.bind.annotation.JsonbDateFormat;

public class TicketPoolDefinitionDTO {

  public Long id;

  public String name;

  public Integer availableTicketsNumber;

  public Boolean cyclicalPool;

  public FrequencyDataDTO frequencyData;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date startDate;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date endDate;

  public DateTypeDTO dateType;

  public Boolean predefinedDate;

  public Date date;

  public Long sightEventId;

  public List<TicketDefinitionDTO> ticketDefinitions;

}