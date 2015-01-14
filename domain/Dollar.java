/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Dollar extends Money{

    private String currency;

    public Dollar(int value, String currency){
        super(value,currency);
    }

    String currency(){
        return currency;
    }

}
