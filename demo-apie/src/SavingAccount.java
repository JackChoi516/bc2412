public class SavingAccount extends Account{

  public SavingAccount(Currency currency){
    super(currency, 0.0d);
  }

  public static void main(String[] args) {
    Account savingAccount = new SavingAccount(Currency.HKD);
  }
}
