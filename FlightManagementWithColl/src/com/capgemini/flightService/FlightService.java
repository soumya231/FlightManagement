package com.capgemini.flightService;

import java.util.ArrayList;
import com.capgemini.flightDao.FlightDao;
import com.capgemini.flightDao.IncorrectDataException;
import com.capgemini.flightentity.FlightBean;


public class FlightService implements FlightServiceI {
     static FlightDao dao=new FlightDao();

	
    
  @Override
	public ArrayList<FlightBean> available() {
	  return dao.available();
	}
   @Override
	public ArrayList<FlightBean> add(FlightBean bean1) {
	   validateData(bean1);
		return dao.add(bean1);
	}
  @Override
	public boolean schedule(String airportCode, Long flightNumber, String sourceAirport, String desAirport, String arrivalTime, String departTime, int availableSeats, int scheduleId,
			String carrierName) {
		return dao.schedule(airportCode,flightNumber,sourceAirport,desAirport,arrivalTime,departTime,availableSeats,scheduleId,carrierName);
	}
	

  public void validateData(FlightBean bean){
		if(bean==null){
			throw new IncorrectDataException("please enter the data correctly");
			
		}
	}

}
     
     