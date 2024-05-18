package com.example.finalproject.ItemData.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Itemsdata")
public class Items {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int itemid;
	@NotBlank(message="Please Enter The Name")
	String name;
	@NotBlank
	@Min(value=1)
	String cost;
	@NotNull
	@Min(value = 1)
	int quantity;
    @NotBlank (message="Please Enter Pack")
	@Pattern(regexp = "^Yes|^No|^$",message="Only 'Yes' OR 'No' Will Be Accepted")
	String pack;
    @NotNull
    @Min(value = 0)
	int contents;
    @NotNull
    @Min(value = 1)
	double dimensions;
	@NotBlank
	String origin;
   
	public boolean shipping;
	@NotBlank
	String company;
	
	public Items() {
		super();
	}

	public Items(int itemid, @NotBlank(message = "Please Enter The Name") String name, @NotBlank @Min(1) String cost,
			@NotNull @Min(1) int quantity,
			@NotBlank(message = "Please Enter Pack") @Pattern(regexp = "^Yes|^No|^$", message = "Only 'Yes' OR 'No' Will Be Accepted") String pack,
			@NotNull @Min(0) int contents, @NotNull @Min(1) double dimensions, @NotBlank String origin,
			boolean shipping, @NotBlank String company) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.pack = pack;
		this.contents = contents;
		this.dimensions = dimensions;
		this.origin = origin;
		this.shipping = shipping;
		this.company = company;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public int getContents() {
		return contents;
	}

	public void setContents(int contents) {
		this.contents = contents;
	}

	public double getDimensions() {
		return dimensions;
	}

	public void setDimensions(double dimensions) {
		this.dimensions = dimensions;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isShipping() {
		return shipping;
	}

	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
 

}
