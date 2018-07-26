package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;
import javax.json.bind.annotation.JsonbDateFormat;

public class TicketPoolDTO {

  public Long id;

  public String name;

  public Integer availableTicketsNumber;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date startDate;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  public Date endDate;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private Date entryStartDate;

  @JsonbDateFormat(value = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
  private Date entryEndDate;

  public DateTypeDTO dateType;

  public Boolean predefinedDate;

  public Date date;

  public Long sightEventId;

  public List<TicketDefinitionDTO> ticketDefinitions;


  public Integer boughtTicketNumber;

  public Integer totalTicketsNumber;

}
