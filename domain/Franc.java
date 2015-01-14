/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Franc extends Money{

    private String currency;

    public Franc(int value,String currency){
       super(value,currency);
    }
    String currency(){
        return currency;
    }
}
