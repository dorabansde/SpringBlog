package me.jwc.springbootdeveloper.dto;

import lombok.Getter;
import me.jwc.springbootdeveloper.domain.Users;

@Getter
public class UsersResponse {

    private final String users;
    private final String pw;

    public UsersResponse(Users users) {
        this.users = users.getEmail();
        this.pw = users.getPw();
    }
}
