package pl.hellopoland.dto.booking;

import java.io.ByteArrayOutputStream;
import java.util.Date;
import pl.hellopoland.dto.DTOSuperclass;
import pl.hellopoland.dto.DiscountDTO;
import pl.hellopoland.dto.StatusDTO;
import pl.hellopoland.dto.TicketPoolInfoDTO;

public class TicketDTO extends DTOSuperclass {

  public Long id;
  public String name;
  public Integer price;
  public Date date;
  public StatusDTO status;
  public String serialNumber;
  public ByteArrayOutputStream qrCode;
  public Long ticketDefinitionId;
  public Long tickerPoolDefinitionId;
  public Long bookingId;
  public BookingDTO booking;
  public boolean wholeDay;
  public DiscountDTO discount;
  public TicketPoolInfoDTO ticketPoolInfo;

}
