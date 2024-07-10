package my.project.transport_tickets.model;

import lombok.Data;

@Data
public class Route {
    private int id;
    private String departurePoint;
    private String destination;
    private int duration;
    Carrier carrier;
}
