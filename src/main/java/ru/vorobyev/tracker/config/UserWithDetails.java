package ru.vorobyev.tracker.config;

import lombok.Getter;
import ru.vorobyev.tracker.domain.user.User;

@Getter
public class UserWithDetails extends org.springframework.security.core.userdetails.User {

    private static final long serialVersionUID = 1L;

    private User user;

    public UserWithDetails(User user) {
        super(user.getEmail(), user.getPassword(), true, true, true, true, user.getRoles());
        this.user = user;
    }

    public int getId() {
        return user.getId();
    }

    @Override
    public String toString() {
        return user.toString();
    }
}
