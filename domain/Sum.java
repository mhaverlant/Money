/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Sum implements Expression {
    Expression addend;
    Expression augend;

    Sum(Expression augend,Expression addend){
        this.augend=augend;
        this.addend=addend;
    }

    public Money reduce(Bank bank,String to){
        int value = augend.reduce(bank,to).value + addend.reduce(bank,to).value;
        return new Money(value,to);
    }

    public Expression plus(Expression addend){
        return null;
    }
}
