package pl.hellopoland.dto;

import java.util.List;

public class TicketDefinitionDTO {

  public Long id;
  public String name;
  public Integer availableTicketsNumber;
  public Integer price;
  public DateTypeDTO dateType;
  public Long ticketPoolId;
  public List<Long> ticketPoolDefinitionIds;

}
