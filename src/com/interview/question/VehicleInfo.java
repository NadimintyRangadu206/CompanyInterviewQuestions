package com.interview.question;

import java.sql.Time;

public class VehicleInfo {

	private int vehicleNo;
	private String vehicleType;
	private String vehicleModel;
	private String phoneNo;
	private String customerName;
	private Time time;

	public int getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "VehicleInfo [vehicleNo=" + vehicleNo + ", vehicleType=" + vehicleType + ", vehicleModel=" + vehicleModel
				+ ", phoneNo=" + phoneNo + ", customerName=" + customerName + ", time=" + time + "]";
	}

}
