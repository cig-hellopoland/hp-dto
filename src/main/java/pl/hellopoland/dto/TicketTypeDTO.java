package pl.hellopoland.dto;

public class TicketTypeDTO extends DTOSuperclass {

  public Long id;
  public String code;
  public String label;
  public Boolean eligibleForPriceFrom;
  public Boolean active;
  public Integer sortOrder;

}
