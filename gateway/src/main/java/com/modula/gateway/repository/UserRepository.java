package com.modula.gateway.repository;

import com.modula.gateway.config.ApplicationConfig;
import com.modula.gateway.model.User;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private final Map<String, User> users = new ConcurrentHashMap<>();

    public UserRepository(ApplicationConfig config) {
        var admin = config.getUsers().getDefaultUsers().getAdmin();
        var regularUser = config.getUsers().getDefaultUsers().getUser();

        users.put(admin.getUsername(),
                User.builder()
                        .username(admin.getUsername())
                        .password(admin.getPassword())
                        .build());

        users.put(regularUser.getUsername(),
                User.builder()
                        .username(regularUser.getUsername())
                        .password(regularUser.getPassword())
                        .build());
    }

    public Optional<User> findByUsername(String username) {
        return Optional.ofNullable(users.get(username));
    }

    public void save(User user) {
        users.put(user.getUsername(), user);
    }
}
