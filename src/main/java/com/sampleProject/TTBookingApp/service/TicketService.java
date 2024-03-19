package com.sampleProject.TTBookingApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sampleProject.TTBookingApp.model.Ticket;
import com.sampleProject.TTBookingApp.repository.ITicketRepo;

@Service
public class TicketService {

	@Autowired
	ITicketRepo ticketRepository;
	public TicketService(ITicketRepo ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket purchaseTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

//    public List<Ticket> getTicketsBySection(String seatSection) {
//        return ticketRepository.findBySection(seatSection);
//    }

    public void removeTicket(Long ticketId) {
        ticketRepository.deleteById(ticketId);
    }

    public Ticket modifySeat(Long ticketId, String newSeatNumber) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(ticketId);
        if (optionalTicket.isPresent()) {
            Ticket ticket = optionalTicket.get();
            ticket.setSeatNumber(newSeatNumber);
            return ticketRepository.save(ticket);
        }
        return null;
    }
}
