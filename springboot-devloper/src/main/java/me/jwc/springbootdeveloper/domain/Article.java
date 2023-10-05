package me.jwc.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;

@Entity // 엔티티로 지정
public class Article {

    @Id // id 필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "title", nullable = false) // 'title'이라는 not null 컬럼과 매핑
    private String content;

    @Column(name = "content", nullable = false)
    private String title;

    @Builder // 빌더 패턴으로 객체 생성
    public Article(String title, String content){
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    /*    protected Article(){ // 기본 생성자
    }

    // 게터

    public String getTitle() {
        return title;
    }

    public String getContetnt(){
        return content;
    }*/
}
