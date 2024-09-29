package my.project.transport_tickets.dto;

import lombok.Data;

@Data
public class Registration {
    private String login;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
}
