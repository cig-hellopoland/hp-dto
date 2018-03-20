package pl.hellopoland.dto;

import java.util.Collection;

public class Sight {
	  public String name;
	  public String lead;
	  public String description;
	  public String mainImageUrl;
	  public String email;
	  public String phone;

	  public Location location;
	  public Collection<Ticket> tickets;

	  public Collection<OpeningHours> openingHours;
	  public Collection<Agreement> agreements;
}
