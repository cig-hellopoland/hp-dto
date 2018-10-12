package pl.hellopoland.dto;

import java.time.LocalDateTime;

public class FileDescriptorDTO extends DTOSuperclass {
  public Long id;
  public String path;
  public LocalDateTime created;
  public String type;
}
