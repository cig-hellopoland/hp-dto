package pl.hellopoland.dto;

import java.util.List;

public class TicketDefinitionDTO {

  public Long id;
  public String name;
  public Integer availableTicketsNumber;
  public Integer price;
  public Long poolId;


  public List<Object> ticketPools;

}
