package pl.hellopoland.dto;

public abstract class DTOSuperclass implements Cloneable {

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
