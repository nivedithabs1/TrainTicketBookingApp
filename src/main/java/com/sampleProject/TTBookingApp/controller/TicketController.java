package com.sampleProject.TTBookingApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.sampleProject.TTBookingApp.model.Ticket;
import com.sampleProject.TTBookingApp.service.TicketService;


@Controller
@RequestMapping("/api/tickets")
public class TicketController {
	TicketService ticketService;
	
    @Autowired
    
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    
//    @PostMapping({"/{seatSection}","viewTickets"})
//    public String viewTicketList(Model model,@ModelAttribute("message") String message,@PathVariable String seatSection) {
//    	model.addAttribute("list",ticketService.getTicketsBySection(seatSection));
//    	model.addAttribute("message",message);
//    	
//        return "viewTickets";
//    }
    
    @PostMapping("/purchase")
    public Ticket purchaseTicket(@RequestBody Ticket ticket) {
        return ticketService.purchaseTicket(ticket);
    }

//    @GetMapping("/seatSection/{seatSection}")
//    public List<Ticket> getTicketsBySection(@PathVariable String seatSection) {
//        return ticketService.getTicketsBySection(seatSection);
//    }

    @DeleteMapping("/{ticketId}")
    public void removeTicket(@PathVariable Long ticketId) {
        ticketService.removeTicket(ticketId);
    }

    @PutMapping("/{ticketId}/modify-seat")
    public Ticket modifySeat(@PathVariable Long ticketId, @RequestParam String newSeatNumber) {
        return ticketService.modifySeat(ticketId, newSeatNumber);
    }
}
