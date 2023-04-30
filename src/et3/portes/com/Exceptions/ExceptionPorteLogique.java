package et3.portes.com.Exceptions;

public class ExceptionPorteLogique extends RuntimeException{
    public ExceptionPorteLogique(){
        super("ExceptionPorteLogique");
    }
    public ExceptionPorteLogique(String msg){
        super("ExceptionPorteLogique : "+msg);
    }
}
