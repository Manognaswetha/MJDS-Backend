package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Jewellery {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String weight;
	private String carats;
	private String refId;
	private String cost;
	private String spl;
	@Column(length=1000000)
	private byte[] image;
	public Jewellery() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jewellery(int id, String name, String weight, String carats, String refId, String cost, String spl,
			byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.carats = carats;
		this.refId = refId;
		this.cost = cost;
		this.spl = spl;
		this.image = image;
	}
	
	public Jewellery(String name, String weight, String carats, String refId, String cost, String spl,
			byte[] image) {
		super();
		
		this.name = name;
		this.weight = weight;
		this.carats = carats;
		this.refId = refId;
		this.cost = cost;
		this.spl = spl;
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getCarats() {
		return carats;
	}
	public void setCarats(String carats) {
		this.carats = carats;
	}
	public String getRefId() {
		return refId;
	}
	public void setRefId(String refId) {
		this.refId = refId;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getSpl() {
		return spl;
	}
	public void setSpl(String spl) {
		this.spl = spl;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Jewellery [name=" + name + ", weight=" + weight + ", carats=" + carats + ", refId=" + refId + ", cost="
				+ cost + ", spl=" + spl + "]";
	}
	
	
	
	
	
	

	
	
}
