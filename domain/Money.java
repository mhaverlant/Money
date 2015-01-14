/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Money {
    public int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }


    public boolean equals(Object object){
        Money money = (Money)object;
        return this.value == money.getValue();
    }
}
