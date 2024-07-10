package my.project.transport_tickets.repository;

import my.project.transport_tickets.model.Users;
import org.springframework.jdbc.core.JdbcTemplate;

public class UsersRep {
    private final JdbcTemplate template;

    public UsersRep(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Users users) {
        String sql = "insert into users values(?,?,?,?)";
        template.update(sql, users.getId(), users.getFullName(), users.getLogin(), users.getPassword());
    }
}
