package com.sampleProject.TTBookingApp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "ticket")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
    private String fromLocation;
	@Column
    private String toLocation;
	@Column
    private double pricePaid;
	@Column
    private String seatSection;
	@Column
    private String seatNumber;
    
//	private User user;
	public Ticket(Long id, String fromLocation, String toLocation, double pricePaid, String seatSection,
			String seatNumber) {
		super();
		this.id = id;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.pricePaid = pricePaid;
		this.seatSection = seatSection;
		this.seatNumber = seatNumber;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public double getPricePaid() {
		return pricePaid;
	}

	public void setPricePaid(double pricePaid) {
		this.pricePaid = pricePaid;
	}

	public String getSeatSection() {
		return seatSection;
	}

	public void setSeatSection(String seatSection) {
		this.seatSection = seatSection;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	
//	public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fromLocation=" + fromLocation + ", toLocation=" + toLocation + ", seatSection="
				+ seatSection + ", seatNumber=" + seatNumber + "]";
	}
}
