package me.jwc.springbootdeveloper.repository;

import me.jwc.springbootdeveloper.domain.Article;
import me.jwc.springbootdeveloper.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
