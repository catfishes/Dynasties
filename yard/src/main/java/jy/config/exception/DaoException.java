package jy.config.exception;

public class DaoException extends Exception {

    public DaoException (){

    }

    public DaoException (String e){
        super(e);
    }

    public DaoException(String e,Throwable throwable){
        super(e,throwable);
    }
}
