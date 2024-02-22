package me.jwc.springbootdeveloper.repository;

import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email); // ① email로 사용자 정보를 가져옴
}
