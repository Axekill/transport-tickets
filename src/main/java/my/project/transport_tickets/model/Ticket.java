package my.project.transport_tickets.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ticket {
    private int id;
    private double price;
    private int placeNumber;
    private LocalDateTime dateTime;
    Route route;
}
