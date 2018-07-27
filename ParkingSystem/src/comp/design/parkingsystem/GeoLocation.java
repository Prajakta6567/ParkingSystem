package comp.design.parkingsystem;

/**
 * This class currently acts as a point gps location and supports GeoJSON. See
 * GeoJSON: https://tools.ietf.org/html/rfc7946.
 */
public class GeoLocation {

	// Longitude, Latitude
	public double lng, lat;

	public String toGeoJSON() {
		return "{\"type\": \"Point\", \"coordinates\": [" + lng + ", " + lat + "}";
	}

}
