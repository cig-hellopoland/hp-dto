package pl.hellopoland.dto;

import java.util.List;

public class TicketDefinitionDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public Integer availableTicketsNumber;
  public Integer price;
  public Long poolId;
  public Long sightEventId;
  public Long atnaId;
  public Long partnerId;

  public List<Object> ticketPools;

  public DiscountDTO discount;

  public Integer getRealPrice() {
    if (discount != null) {
      return discount.price;
    }
    return price;
  }
}
