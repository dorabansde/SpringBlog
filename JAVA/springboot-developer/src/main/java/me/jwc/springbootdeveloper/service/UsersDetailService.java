package me.jwc.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jwc.springbootdeveloper.domain.Users;
import me.jwc.springbootdeveloper.repository.UsersRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
// 스프링 시큐리티에서 사용자 정보를 가져오는 인터페이스
public class UsersDetailService implements UserDetailsService {

    private final UsersRepository usersRepository;

    // 사용자 이름(email)으로 사용자의 정보를 가져오는 메서드
    @Override
    public Users loadUserByUsername(String email) {
        return usersRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException((email)));
    }
}