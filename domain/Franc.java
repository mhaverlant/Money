/**
 * Created by haverlantmatthias on 14/01/15.
 */
public class Franc {
    private int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }

    public Franc times(int multiplier){
        Franc multi=new Franc ();
        multi.setValue(this.value*multiplier);
        return multi;
    }

    public boolean equals(Object object){
        Franc Franc = (Franc)object;
        return this.value == Franc.getValue();
    }
}
