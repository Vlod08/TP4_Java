package et3.portes.com.Exceptions;


public class ExceptionBasculeAReparer extends RuntimeException{
    public ExceptionBasculeAReparer(){
        super("ExceptionBasculeAReparer");
    }

    public ExceptionBasculeAReparer(String msg){
        super("ExceptionBasculeAReparer : "+ msg);
    }
}
