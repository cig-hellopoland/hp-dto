package pl.hellopoland.dto;

import java.util.List;

public class TicketDefinitionDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public Integer availableTicketsNumber;
  public Integer price;
  public Long poolId;

  public List<Object> ticketPools;

  // discount
  public Boolean discountIsHplOwner;
  public Integer discountValue;
  public DiscountTypeDTO discountType;
  public Integer discountHplPart;
  public Integer discountPartnerPart;

}
