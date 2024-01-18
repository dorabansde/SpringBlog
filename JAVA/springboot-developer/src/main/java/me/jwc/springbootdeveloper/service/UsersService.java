package me.jwc.springbootdeveloper.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.domain.Users;
import me.jwc.springbootdeveloper.dto.AddArticleRequest;
import me.jwc.springbootdeveloper.dto.AddUsersRequest;
import me.jwc.springbootdeveloper.dto.UpdateArticleRequest;
import me.jwc.springbootdeveloper.repository.BlogRepository;
import me.jwc.springbootdeveloper.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자 추가
@Service // 빈으로 등록
public class UsersService {

    private final UsersRepository usersRepository;

    // 블로그 글 추가 메서드
    public Users save(AddUsersRequest request) {

        AddUsersRequest aar1 = new AddUsersRequest();
        AddUsersRequest aar2 = new AddUsersRequest("제목1", "내용1");
//        aar2.setContent("내용수정");
        AddUsersRequest aar3 = new AddUsersRequest();
        aar2.getPw();
        return usersRepository.save(request.toEntity());
    }

    public List<Users> findAll() {
        return usersRepository.findAll();
    }

   /* public Article findById(long id){
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
    }*/
}
