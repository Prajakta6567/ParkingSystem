package comp.design.parkingsystem;

import comp.design.parkingsystem.ParkingSystem.GeoLocation;

public class Driver {

	private String custName;
	private String LicensePlate;
	private int custId;
	private int phoneNumber;
	private String carMake;
	private String carModel;
	private int carYear;
	private int currentReservation;
	public GeoLocation location;
	
	/**
	 * Constructor
	 * @param cName
	 * @param lPlate
	 * @param custId
	 * @param phNo
	 * @param carMake
	 * @param carModel
	 * @param carYear
	 */
	public Driver( String cName, String lPlate, int custId, 
				int phNo, String carMake, String carModel, int carYear, int curReserve) {
		
	}
	
	public GeoLocation getCarLocation() {
		return location;
		
	}
	
	public void setCurrentReservationID(int id){
		currentReservation=id;
	}
	
	public int getCurrentReservationID(){
		return currentReservation;
	}
	
	/**Functions that Return Customer Values*/
	public int getCustomerID(){
		return custId;
	}
	public String getCustomerName(){
		return custName;
	}

	public String getLicensePlate() {
		return LicensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarYear() {
		return carYear;
	}

	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
	
	
	
	
}
