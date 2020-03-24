package com.capgemini.flightentity;

public class FlightBean{
	private long flightNumber;
	private String flightModel;
	private int seatCapacity;
	private String airportLocation;
	private String airportName;
	private String airportCode;
	private String sourceAirport;
	private String destinationairport;
	private String arrivalTime;
	private String deptTime;
	private int ScheduleId;
	private int availableSeats;
	private String carrierName;
	public long getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightModel() {
		return flightModel;
	}
	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	@Override
	public String toString() {
		return "FlightBean [flightNumber=" + flightNumber + ", flightModel=" + flightModel + ", seatCapacity="
				+ seatCapacity + ", airportLocation=" + airportLocation + ", airportName=" + airportName
				+ ", airportCode=" + airportCode + ", sourceAirport=" + sourceAirport + ", destinationairport="
				+ destinationairport + ", arrivalTime=" + arrivalTime + ", deptTime=" + deptTime + ", ScheduleId="
				+ ScheduleId + ", availableSeats=" + availableSeats + ", carrierName=" + carrierName + "]";
	}
	public String getAirportLocation() {
		return airportLocation;
	}
	public void setAirportLocation(String airportLocation) {
		this.airportLocation = airportLocation;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationairport() {
		return destinationairport;
	}
	public void setDestinationairport(String destinationairport) {
		this.destinationairport = destinationairport;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public int getScheduleId() {
		return ScheduleId;
	}
	public void setScheduleId(int scheduleId) {
		ScheduleId = scheduleId;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	
	public FlightBean() {
	}
	
	
}