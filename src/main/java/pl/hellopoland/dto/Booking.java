package pl.hellopoland.dto;

import java.util.Collection;

public class Booking {
  public String customerName;
  public String customerEmail;
  public Collection<Booking.Ticket> ticketBookings;

  public class Ticket {
    public Long ticketDefinitionId;
    public Long numberOfTickets;
  }
}
