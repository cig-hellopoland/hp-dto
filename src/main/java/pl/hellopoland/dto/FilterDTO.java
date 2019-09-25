package pl.hellopoland.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FilterDTO {

  public String query = "";
  public LocalDate fromDate = LocalDate.now();
  public LocalDate toDate = LocalDate.now().plusDays(30);
  public List<String> city = new ArrayList<>();
  public List<FilterPriceEntryDTO> prices = new ArrayList<>();
  public List<TagDTO> tags = new ArrayList<>();
  public List<CategoryDTO> categories = new ArrayList<>();

}
