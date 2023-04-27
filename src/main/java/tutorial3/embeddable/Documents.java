package tutorial3.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Documents 
{
	@Column(name = "driving_license", length = 3)
	private boolean drivingLicense;
	
	@Column(name = "vehicle_rc", length =3)
	private boolean vehicleRC;
	/**
	 * @return the drivingLicense
	 */
	public boolean getDrivingLicense() {
		return drivingLicense;
	}
	/**
	 * @return the vehicleRC
	 */
	public boolean getVehicleRC() {
		return vehicleRC;
	}
	/**
	 * @param drivingLicense the drivingLicense to set
	 */
	public void setDrivingLicense(boolean drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	/**
	 * @param vehicleRC the vehicleRC to set
	 */
	public void setVehicleRC(boolean vehicleRC) {
		this.vehicleRC = vehicleRC;
	}
}
