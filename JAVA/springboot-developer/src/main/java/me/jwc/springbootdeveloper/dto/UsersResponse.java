package me.jwc.springbootdeveloper.dto;

import lombok.Getter;
import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.domain.Users;

@Getter
public class UsersResponse {

    private final String nickname;
    private final String pw;

    public UsersResponse(Users users) {
        this.nickname = users.getNickname();
        this.pw = users.getPw();
    }
}
