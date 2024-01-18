package me.jwc.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.domain.Users;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddUsersRequest {

    private String nickname;
    private String pw;

    public Users toEntity(){ // 생성자를 사용해 객체 생성
        return Users.builder()
                .nickname(nickname)
                .pw(pw)
                .build();
    }
}