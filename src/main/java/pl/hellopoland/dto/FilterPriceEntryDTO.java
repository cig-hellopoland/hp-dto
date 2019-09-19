package pl.hellopoland.dto;

public class FilterPriceEntryDTO {

  public FilterPriceEntryDTO(Integer minPrice, Integer maxPrice) {
    this.minPrice = minPrice;
    this.maxPrice = maxPrice;
  }

  public Integer minPrice;
  public Integer maxPrice;

}
