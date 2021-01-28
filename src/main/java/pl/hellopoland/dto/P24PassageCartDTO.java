package pl.hellopoland.dto;

public class P24PassageCartDTO extends DTOSuperclass {
  public boolean requiresPayment = true;
  public Long orderId;
  public String orderHash;
  public boolean isSandbox;
  public P24PassageTransactionParamsDTO transactionParams;
}
