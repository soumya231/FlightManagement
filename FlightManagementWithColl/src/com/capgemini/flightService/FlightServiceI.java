package com.capgemini.flightService;

import java.util.ArrayList;
import com.capgemini.flightentity.FlightBean;

public interface FlightServiceI {

	
	ArrayList<FlightBean> add(FlightBean bean1);

	boolean schedule(String airportCode, Long flightNumber, String sourceAirPort, String destinationAirport, String arrivalTime, String departTime, int availableSeats, int scheduleId,
			String carrierName);

	ArrayList<FlightBean> available();

	

	

}
