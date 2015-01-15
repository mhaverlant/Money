/**
 * Created by haverlantmatthias on 14/01/15.
 */
interface Expression {
    Money reduce(Bank bank,String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
