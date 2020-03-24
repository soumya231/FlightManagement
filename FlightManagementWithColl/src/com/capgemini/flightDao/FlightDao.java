package com.capgemini.flightDao;

import java.util.ArrayList;
import java.util.Iterator;
import com.capgemini.flightentity.FlightBean;

public class FlightDao implements FlightDaoI{
	FlightBean bean=new FlightBean();
	static ArrayList<FlightBean> list= new ArrayList<FlightBean>();
	
	@Override
	public ArrayList<FlightBean> add(FlightBean bean1) {
		list.add(bean1);
		return list;
		}
	@Override
  public ArrayList<FlightBean> available() {
		bean.getDestinationairport();
		bean.getArrivalTime();
		bean.getDeptTime();
		bean.getDestinationairport();
		bean.getSourceAirport();
		bean.getScheduleId();
		bean.getAvailableSeats();
		bean.getCarrierName();
	return list;
}
  
@Override
public boolean schedule(String airportCode, Long flightNumber, String sourceAirPort, String destinationAirport, String arrivalTime, String departTime, int availableSeats, int scheduleId,
		String carrierName) {
	validationCheck(flightNumber);
	Iterator<FlightBean> itr=list.iterator();
	while (itr.hasNext()) 
    {
       bean=  itr.next();
    	long s=bean.getFlightNumber();
    	if(s==flightNumber){
    		bean.setFlightNumber(flightNumber);
    		bean.setSourceAirport(sourceAirPort);
    		bean.setDestinationairport(destinationAirport);
    		bean.setArrivalTime(arrivalTime);
    		bean.setDeptTime(departTime);
    		bean.setScheduleId(scheduleId);
    		bean.setCarrierName(carrierName);
    		bean.setAvailableSeats(availableSeats);
    	}
    }
	
	return true;
}

  public void validationCheck(long fN ) {
	  Iterator<FlightBean> itr=list.iterator();
	  while (itr.hasNext()) 
	    {
	       bean=  itr.next();
	    	long s=bean.getFlightNumber();
	    	if(s!=fN){
          throw new FlightNotFoundException("No Account found for this number=" + fN);
      }

  }
  }
 
	
}