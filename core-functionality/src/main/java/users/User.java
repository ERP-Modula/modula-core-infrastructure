package users;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Set;
import java.util.UUID;

@Table("users")
@Data
public class User {
    private UUID uuid;
    private String username;
    private Set<String> roles;
}
