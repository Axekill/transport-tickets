package my.project.transport_tickets.model;

import lombok.*;

@Data
public class Users {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private final String fullName = firstName + " " + middleName + " " + lastName;
    private String login;
    private String password;

}
