package me.jwc.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.dto.AddArticleRequest;
import me.jwc.springbootdeveloper.dto.UpdateArticleRequest;
import me.jwc.springbootdeveloper.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class BlogService {

    private final BlogRepository blogRepository;

    // 블로그 글 추가 메서드
    public Article save(AddArticleRequest request) {

        AddArticleRequest aar1 = new AddArticleRequest();
        AddArticleRequest aar2 = new AddArticleRequest("제목1", "내용1");
//        aar2.setContent("내용수정");
        AddArticleRequest aar3 = new AddArticleRequest();
        aar2.getContent();
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }

    public Article findById(long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));
    }

    public void delete(long id) {
        blogRepository.deleteById(id);
    }

    @Transactional // 트랜젝션 메서드
    public Article update(long id, UpdateArticleRequest request){
        Article article = blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: " + id));

        article.update(request.getTitle(), request.getContent());

        return article;
    }
}