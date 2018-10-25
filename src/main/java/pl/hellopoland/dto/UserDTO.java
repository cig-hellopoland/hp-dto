package pl.hellopoland.dto;

import java.util.Set;

public class UserDTO extends DTOSuperclass {
  public Long id;
  public String name;
  public String email;
  public Set<RoleDTO> roles;
}
