/*
package me.jwc.springbootdeveloper.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import me.jwc.springbootdeveloper.repository.BlogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;


@SpringBootTest // 테스트용 애플리케이션 컨텍스트
@AutoConfigureMockMvc // MockMvc 생성 및 자동 구성

class BlogApControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper; // 직렬화, 역질렬화를 위한 클래스

    @Autowired
    private WebApplicationContext context;

    @Autowired
    BlogRepository blogRepository;

    @BeforeEach // 테스트 실행 전 실행하는 메서드
    public void mockMvcSetup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .build();
        blogRepository.deleteAll();
    }
}
*/
