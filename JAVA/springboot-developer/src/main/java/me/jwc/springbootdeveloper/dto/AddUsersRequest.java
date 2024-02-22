package me.jwc.springbootdeveloper.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AddUsersRequest {
    private String email;
    private String pw;
}