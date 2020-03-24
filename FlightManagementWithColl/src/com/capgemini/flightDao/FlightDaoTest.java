package com.capgemini.flightDao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.Test;
import com.capgemini.flightentity.FlightBean;


public class FlightDaoTest {
	FlightDao dao=new FlightDao();
	
	
	@Test                             //testing unit for flights add method
	public void testAdd_1() {
		FlightBean bean1=new FlightBean();
		bean1.getFlightNumber();
		bean1.getFlightModel();
		bean1.getAirportCode();
		bean1.getSeatCapacity();
        assertNotNull(dao.add(bean1));

	}
	@Test                               //testing unit for available flights method
	public void testView(){           
		int count=0;
		ArrayList<FlightBean> result=dao.available();
		while((result).isEmpty()){
			count++;
		}
		assertNull(count);
		
	}
	@Test                              //testing unit for flights scheduling method
	public void testSchedule(){
		boolean var=true;
		String aC="12";
		long fN=3;
		String sourceAP="hyd";
		String desAp="bangalore";
		String aT="4 pm";
		String dT="5 am";
		int aS=4;
		int sC=6;
		String cN="seenu";
		boolean var1=dao.schedule(aC, fN, sourceAP, desAp, aT, dT, aS, sC, cN);
		assertEquals(var,var1);
	}

}
