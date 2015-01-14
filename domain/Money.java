/**
 * Created by haverlantmatthias on 14/01/15.
 */
abstract class Money {

    abstract Money times(int multiplier);
    public int value;

    public void setValue(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }


    public boolean equals(Object object){
        Money money = (Money)object;
        return (this.value == money.getValue()
                && this.getClass() == money.getClass());
    }
    public static Money dollar(int valeur){
        Dollar dol= new Dollar();
        dol.setValue(valeur);
        return dol;
    }
    public static Money franc(int valeur){
        Franc frc= new Franc();
        frc.setValue(valeur);
        return frc;
    }

}
