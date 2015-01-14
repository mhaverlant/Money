/**
 * Created by haverlantmatthias on 14/01/15.
 */
abstract class Money {

    abstract Money times(int multiplier);
    abstract String currency();

    protected String currency;
    public int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }

    public String Currency(){
        return currency;
    }

    public Money(int value,String currency){
        this.value=value;
        this.currency = currency;
    }


    public boolean equals(Object object){
        Money money = (Money)object;
        return (this.value == money.getValue()
                && this.getClass() == money.getClass());
    }

    public static Money dollar(int valeur){
        return new Dollar(valeur,"USD");
    }

    public static Money franc(int valeur){
        return new Franc (valeur,"CHF");
    }



}
