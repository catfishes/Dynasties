package jy.config.exception;

public class SaveException extends Exception{

    public SaveException(){}

    public SaveException(Exception e){
        super(e);
    }

    public SaveException(String e,Throwable throwable){
        super(e,throwable);

    }
}
