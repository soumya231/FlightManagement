package com.capgemini.flightUi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.capgemini.flightDao.FlightNotFoundException;
import com.capgemini.flightDao.IncorrectDataException;
import com.capgemini.flightService.FlightService;
import com.capgemini.flightentity.FlightBean;

public class FlightUi {
	public void list(){
		 System.out.println("SELECT YOUR OPERATIONS");
			System.out.println(" ");
			System.out.println("1.Add flights");
			System.out.println("2.schedule flights");
			System.out.println("3.available flights");
	}
	
	public static int getOption(Scanner scanner)//7
    {
   try {
            int option = scanner.nextInt();
            return option;
        } catch (Throwable e) {
            e.printStackTrace();
            return -1;
        }
    }
	 static FlightService service=new FlightService();
	public void choose(){
			FlightBean bean1=new FlightBean();
			boolean run=true;
    while(run){
    	list();
    	Scanner sc=new Scanner(System.in);
         int option = getOption(sc);//6 1
         if (option == -1)
         {
             run = false;
         }
    switch(option){
    case 1:                                         //to add flights into database
    	try{ 
    	System.out.println("enter flightNumber");
          long flightNumber=sc.nextLong();
          System.out.println("flightModel");
          String flightModel=sc.next();
          System.out.println("enter seatCapacity");
          int seatCapacity=sc.nextInt();
          System.out.println("enter airportcode");
          String airportCode=sc.next();
          bean1.setFlightNumber(flightNumber);
          bean1.setFlightModel(flightModel);
          bean1.setSeatCapacity(seatCapacity);
          bean1.setAirportCode(airportCode);
    ArrayList<FlightBean> result=service.add(bean1);
    System.out.println(result);
    	}
    	catch(IncorrectDataException e){
    		e.printStackTrace();
    		System.out.println("enter proper data to add");
    	}
    	catch(InputMismatchException e){
    		e.printStackTrace();
    		System.out.println("sorry something went wrong");
    	}
    break;
    case 2:                 //to schedule flights
    	try{
    	System.out.println("enter Airportcode");
    	String AirportCode=sc.next();
    	System.out.println("enter flightNumber");
    	Long FlightNumber=sc.nextLong();
    	System.out.println("enter sourceAirport");
    	String sourceAirport=sc.next();
    	System.out.println("enter destinationAirport");
    	String desAirport=sc.next();
    	System.out.println("enter arrivaltime");
    	String ArrivalTime=sc.next();
    	System.out.println("enter deptTime");
    	String DepartureTime=sc.next();
    	System.out.println("enter available seats");
    	int AvailableSeats=sc.nextInt();
    	System.out.println("enter scheduledId");
    	int ScheduleId=sc.nextInt();
    	System.out.println("enter carrierName");
    	String CarrierName=sc.next();
    	boolean resul=service.schedule(AirportCode,FlightNumber,sourceAirport,desAirport,ArrivalTime,DepartureTime,AvailableSeats,ScheduleId,CarrierName);
    	System.out.println(resul);
    	} 
    	catch (FlightNotFoundException e) {
    		e.printStackTrace();
             System.out.println("no flight exist with such flightnumber");
         }
    	catch(Throwable e){
    		e.printStackTrace();
    		System.out.println("sorry something went wrong");
    	}
        break;
    case 3:              //to view available flights                        
    try{
    	ArrayList<FlightBean> result=service.available();
    	System.out.println(result);
    }
    catch(Throwable e){
    	System.out.println("no records to show");
    }
    	break;
    default:{
        run = false;
        System.out.println("choose from given options !");
    }
    	
	}

}
}
	 public static void main(String[] args) {
	        FlightUi ui = new FlightUi();//1
	        ui.choose();//2
	    }}