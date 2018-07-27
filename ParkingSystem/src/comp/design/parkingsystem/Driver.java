package comp.design.parkingsystem;

/**
 *
 * This represents an owner/vehicle object that combines information about a
 * driver's basic information and the driver's vehicle.
 *
 */
public class Driver {

	private String name;
	private String LicensePlate;
	private int id;
	private int phoneNumber;
	private String carMake;
	private String carModel;
	private int carYear;
	private int currentReservation;
	public GeoLocation location;

	/**
	 * Constructor
	 *
	 * @param name
	 * @param lPlate
	 * @param id
	 * @param phone
	 * @param carMake
	 * @param carModel
	 * @param carYear
	 */
	public Driver(String name, String lPlate, int id, long phone, String carMake, String carModel, int carYear) {
	}

	public GeoLocation getCarLocation() {
		return location;
	}

	public void setCurrentReservationID(int id) {
		currentReservation = id;
	}

	public int getCurrentReservationID() {
		return currentReservation;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
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
