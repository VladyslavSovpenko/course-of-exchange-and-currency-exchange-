package bankApi;

public enum CurrencyEnum {
    USD("USD", 840),
    UAH("UAH", 980),
    EUR("EUR", 978),
    RUB("RUB", 643),
    EURUSD("EURUSD");

    String value;
    int isoCode;

    CurrencyEnum(String value, int isoCode) {
        this.value = value;
        this.isoCode = isoCode;
    }
    CurrencyEnum(String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public int getIsoCode() {
        return isoCode;
    }
}
