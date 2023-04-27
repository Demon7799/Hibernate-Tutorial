package tutorial1.column_annotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int id;
	
	@Column(name="house_no")
	private int houseNo;
	
	@Column(name="colony",length = 50)
	private String colonyName;
	
	@Column(name="city",length = 100)
	private String cityName;
	
	@Column(name="district", length = 100)
	private String districtName;
	
	@Column(name = "pincode")
	private String areaPinCode;
	

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getHouseNo() 
	{
		return houseNo;
	}

	public void setHouseNo(int houseNo) 
	{
		this.houseNo = houseNo;
	}

	public String getColonyName() 
	{
		return colonyName;
	}

	public void setColonyName(String colonyName) 
	{
		this.colonyName = colonyName;
	}

	public String getCityName() 
	{
		return cityName;
	}

	public void setCityName(String cityName) 
	{
		this.cityName = cityName;
	}

	public String getDistrictName() 
	{
		return districtName;
	}

	public void setDistrictName(String districtName) 
	{
		this.districtName = districtName;
	}

	public String getAreaPinCode() 
	{
		return areaPinCode;
	}

	public void setAreaPinCode(String areaPinCode) 
	{
		this.areaPinCode = areaPinCode;
	}

	@Override
	public String toString() 
	{
		return "AddressEntity [id=" + id + ", houseNo=" + houseNo + ", colonyName=" + colonyName + ", cityName="
				+ cityName + ", districtName=" + districtName + ", areaPinCode=" + areaPinCode + "]";
	}
}
