package uz.pdp.g33weblesson5.repo;

import uz.pdp.g33weblesson5.domain.User;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public static final List<User> USERS = new ArrayList<>();

    public static User save(User user) {
        USERS.add(user);
        return user;
    }

    public static User getByEmail(String email) {
        return USERS.stream().filter(u -> u.getEmail().equals(email))
                .findAny().get();
    }
}
