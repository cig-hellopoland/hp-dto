package pl.hellopoland.dto.booking;

import java.util.Date;
import java.util.List;
import java.util.Set;
import pl.hellopoland.dto.DTOSuperclass;
import pl.hellopoland.dto.FileDescriptorDTO;
import pl.hellopoland.dto.StatusDTO;

public class BookingDTO extends DTOSuperclass {

  public Long id;

  public Date date;

  public String customerName;

  public String customerEmail;

  public StatusDTO status;

  public String serialNumber;

  public List<TicketDTO> tickets;

  public List<TicketOrderDTO> ticketBookings;

  public Boolean invoice;

  @Deprecated
  public Set<FileDescriptorDTO> sightEventPdfAttachments;
}
