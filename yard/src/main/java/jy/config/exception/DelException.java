package jy.config.exception;

public class DelException extends Exception{

    public DelException(){}

    public DelException(Exception e){
        super(e);
    }

    public DelException(String e,Throwable throwable){
        super(e,throwable);
    }

}
