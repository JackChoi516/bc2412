public enum Currency {
  // Scenario for enum
  // 1. Finite numbers of value
  // 2. Not likely to have a new value
  HKD("Hong Kong Dollar", 1),
  CNY("Chinese Yuan Renminbi", 2),
  USD("US Dollar", 3),
  ; 

  private final String desc;
  private final int value;
  // carry more than one attribute

  // private
  private Currency(String desc, int value){
    this.desc = desc;
    this.value = value;
  }

  public String getDesc(){
    return this.desc;
  }

  public int getValue(){
    return this.value;
  }

  public static String getDiscription(Currency currency){
    // before JAva 14
    if (currency == Currency.HKD)
      return "Hong Kong Dollar";
    else if (currency == Currency.CNY)
      return "Chinese Yuan Renminbi";
    else if (currency == Currency.USD)
      return "US Dollar";
    else 
      return "";
    
    // switch (currency) {
    //   case HKD:
    //     return "Hong Kong Dollar";
    //   case CNY:
    //     return "Chinese Yuan Renminbi";
    //   case USD:
    //   return "US Dollar";
    //   default:
    //     return "";
    // }
  }

  public static void main(String[] args) {
    System.out.println(Currency.getDiscription(Currency.CNY));
    //new Currency("ABC"); // You cannot create new Currency object
    System.out.println(Currency.HKD.getDesc());
    System.out.println(Currency.CNY.getValue());

    Currency a = Currency.HKD;
    System.out.println(a.getDesc()); // Hong Kong Dollar

    Currency usd = Currency.USD;
    System.out.println(usd.getValue()); // 3

    Currency cny = Currency.CNY;
    System.out.println(cny.getValue()); // 2
  }
}
