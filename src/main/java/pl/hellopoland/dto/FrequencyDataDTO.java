package pl.hellopoland.dto;

import java.util.Date;
import java.util.List;

public class FrequencyDataDTO extends DTOSuperclass {

  public List<Integer> daysOfWeek;
  public List<Integer> daysOfMonth;
  public Integer frequency;
  public FrequencyTypeDTO frequencyType;
  public Date startDate;
  public Date endDate;
}
