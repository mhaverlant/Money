/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Sum implements Expression {
    Money addend;
    Money augend;

    Sum(Money augend,Money addend){
        this.augend=augend;
        this.addend=addend;
    }

    public Money reduce(Bank bank,String to){
        int value = augend.getValue() + addend.getValue();
        return new Money(value,to);
    }
}
