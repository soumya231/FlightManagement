package com.capgemini.flightDao;

@SuppressWarnings("serial")
public class IncorrectDataException extends RuntimeException {
	   public IncorrectDataException(String msg){
	        super(msg);
	    }
	   public IncorrectDataException(String msg,Throwable e){
	        super(msg,e);
	    }
}
