package pl.hellopoland.dto;

import java.util.List;
import java.util.Set;

public class UserDTO extends DTOSuperclass {
  public Long id;
  public String name;
  public String email;
  public String password;
  public Boolean blocked;
  public Set<RoleDTO> roles;
  public List<Long> allowedSightIds;
}
