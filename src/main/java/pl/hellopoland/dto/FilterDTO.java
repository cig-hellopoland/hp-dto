package pl.hellopoland.dto;

import java.util.ArrayList;
import java.util.List;

public class FilterDTO {

  public String query = "";
  public List<String> city = new ArrayList<>();
  public List<CategoryDTO> categories = new ArrayList<>();
  public List<CategoryDTO> tags = new ArrayList<>();
  public List<FilterPriceEntryDTO> prices = new ArrayList<>();

}
