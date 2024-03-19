package com.sampleProject.TTBookingApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sampleProject.TTBookingApp.model.Ticket;

@Repository
public interface ITicketRepo extends JpaRepository<Ticket,Long>{
//	 List<Ticket> findBySection(String seatSection);
}
