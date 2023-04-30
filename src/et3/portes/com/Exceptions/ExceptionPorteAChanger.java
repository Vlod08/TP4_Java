package et3.portes.com.Exceptions;

public class ExceptionPorteAChanger extends ExceptionPorteLogique {
    public ExceptionPorteAChanger(){
        super("ExceptionPorteAChanger");
    }
    public ExceptionPorteAChanger(String msg){
        super("ExceptionPorteAChanger : "+msg);
    }
}
