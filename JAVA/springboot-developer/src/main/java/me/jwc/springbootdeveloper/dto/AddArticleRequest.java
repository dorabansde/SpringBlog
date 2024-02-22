package me.jwc.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jwc.springbootdeveloper.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

//
//    AddArticleRequest() {};
//    AddArticleRequest(String title, String content) {
//        this.title = title;
//        this.content = content;
//    }

//    public String getContent() {
//        return this.content;
//    }
//        public void setContent(String content) {
//         this.content = content;
//    }

    public Article toEntity() { // 생성자를 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .updatedAt(updatedAt)
                .createdAt(createdAt)
                .build();
    }
}