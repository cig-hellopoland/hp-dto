package pl.hellopoland.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketPoolDefinitionDTO extends DTOSuperclass {

  public Long id;

  public String name;

  public Integer availableTicketsNumber;

  public Boolean isCyclic;

  public FrequencyDataDTO frequencyData;

  public Date startDate;

  public Date endDate;

  public Date entryStartDate;

  public Date entryEndDate;

  public Long sightEventId;

  public List<TicketDefinitionDTO> ticketDefinitions;

  public boolean deleted;
  public boolean wholeDay;

  @Override
  public Object clone() throws CloneNotSupportedException {
    TicketPoolDefinitionDTO copy = (TicketPoolDefinitionDTO) super.clone();
    if (this.frequencyData != null) {
      copy.frequencyData = (FrequencyDataDTO) this.frequencyData.clone();
    }
    if (this.ticketDefinitions != null) {
      copy.ticketDefinitions = new ArrayList<>();
      for (TicketDefinitionDTO td : this.ticketDefinitions) {
        copy.ticketDefinitions.add((TicketDefinitionDTO) td.clone());
      }
    }
    return copy;
  }

}
