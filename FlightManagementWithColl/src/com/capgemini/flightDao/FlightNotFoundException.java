package com.capgemini.flightDao;

@SuppressWarnings("serial")
public class FlightNotFoundException extends RuntimeException {
	public FlightNotFoundException( String msg){
        super(msg);
    }

}
