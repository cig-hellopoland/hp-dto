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

  /**  
   * Can be in % or $ based on discountType.
   * 
   * Example: 
   * if discountValue is in % then value in cash($) is equal to price*discountValue 
   * price = 100($) 
   * discountValue = 20(%) 
   * value($) = 100($) * (20/100) = 20($)
   * 
   * priceAfterDiscount = 100($) - 20($) = 80($)
   */
  public Integer priceAfterDiscount;
  /**
   * in $ or %, based on discountType
   */
  public Integer discountValue;
  public DiscountTypeDTO discountType;

  public Boolean discountIsHplOwner;
  // sum of parts is equal to discount value in $
  /**
   * always is $
   */
  public Integer discountHplPart;
  /**
   * always is $
   */
  public Integer discountPartnerPart; // always in $

  public Integer getRealPrice() {
    if (priceAfterDiscount != null) {
      return priceAfterDiscount;
    }
    return price;
  }
}
