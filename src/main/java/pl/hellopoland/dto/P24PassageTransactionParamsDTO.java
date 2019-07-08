package pl.hellopoland.dto;

import java.util.Collection;

public class P24PassageTransactionParamsDTO extends DTOSuperclass {
  public String address;
  public Integer amount;
  public String city;
  public String client;
  public String country;
  public String currency;
  public String description;
  public String email;
  public String language;
  public Integer merchantId;
  public String phone;
  public String sessionId;
  public String sign;
  public String urlStatus;
  public String zip;
  public String encoding;
  public Collection<P24PassageCartEntryDTO> passageCart;

}
