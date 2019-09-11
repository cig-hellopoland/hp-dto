package pl.hellopoland.dto;

import java.util.Set;

public class CategoryDTO extends DTOSuperclass {

  public Long id;
  public String label;
  public String language;
  public String defaultLanguage;
  public String iconUrl;
  public Set<String> availableLanguageVersions;
  public Integer assignedItemsCount;
  public Boolean restricted;
  public Boolean recommended;

}
