package com.example.payload.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payloads
{
	@Id
	private long loadId;
	private String loadingpoint;
	private String unloadingpoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	private String comment;
    private long shipperid;
    private String date;
    
   
	public long getLoadId() {
		return loadId;
	}

	public String getLoadingpoint() {
		return loadingpoint;
	}

	public String getUnloadingpoint() {
		return unloadingpoint;
	}

	public String getProductType() {
		return productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public String getNoOfTrucks() {
		return noOfTrucks;
	}

	public String getWeight() {
		return weight;
	}

	public String getComment() {
		return comment;
	}

	public long getShipperid() {
		return shipperid;
	}

	public String getDate() {
		return date;
	}

	public void setLoadId(long loadId) {
		this.loadId = loadId;
	}

	public void setLoadingpoint(String loadingpoint) {
		this.loadingpoint = loadingpoint;
	}

	public void setUnloadingpoint(String unloadingpoint) {
		this.unloadingpoint = unloadingpoint;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setShipperid(long shipperid) {
		this.shipperid = shipperid;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Payloads() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payloads(long loadId, String loadingpoint, String unloadingpoint, String productType, String truckType,
			String noOfTrucks, String weight, String comment, long shipperid, String date) {
		super();
		this.loadId = loadId;
		this.loadingpoint = loadingpoint;
		this.unloadingpoint = unloadingpoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperid = shipperid;
		this.date = date;
	}
}
