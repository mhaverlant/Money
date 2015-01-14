/**
 * Created by haverlantmatthias on 14/01/15.
 */
class Money {

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

    public String toString(){
        return value+" "+currency;
    }



    public Money times(int multiplier){
        return new Money(this.value*multiplier,currency);
    };

    public boolean equals(Object object){
        Money money = (Money)object;
        return (value == money.value
                && Currency().equals(money.Currency()));
    }

    public static Money dollar(int valeur){
        return new Dollar(valeur,"USD");
    }

    public static Money franc(int valeur){
        return new Franc (valeur,"CHF");
    }



}
