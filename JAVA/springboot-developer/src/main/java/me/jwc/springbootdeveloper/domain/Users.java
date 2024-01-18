package me.jwc.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "nickname", nullable = false) // 'title'이라는 not null 컬럼과 매핑
    private String nickname;

    @Column(name = "pw", nullable = false)
    private String pw;

    @CreatedDate // 엔티티가 생성될 때 생성 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate // 엔티티가 수정될 때 수정 시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Builder // 빌더 패턴으로 객체 생성
    public Users(String nickname, String pw){
        this.nickname = nickname;
        this.pw = pw;
    }

    public void update(String nickname, String pw){
        this.nickname = nickname;
        this.pw = pw;
    }
}