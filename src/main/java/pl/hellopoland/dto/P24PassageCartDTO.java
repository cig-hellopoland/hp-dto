package pl.hellopoland.dto;

public class P24PassageCartDTO extends DTOSuperclass {
  public boolean requiresPayment = true;
  public boolean isSandbox;
  public P24PassageTransactionParamsDTO transactionParams;
}
