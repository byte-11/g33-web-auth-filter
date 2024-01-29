package uz.pdp.g33weblesson5.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class User {
    private String id = UUID.randomUUID().toString();
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
