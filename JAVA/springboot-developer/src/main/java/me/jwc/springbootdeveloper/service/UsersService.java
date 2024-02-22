package me.jwc.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.jwc.springbootdeveloper.domain.Users;
import me.jwc.springbootdeveloper.dto.AddUsersRequest;
import me.jwc.springbootdeveloper.repository.UsersRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service

public class UsersService {

    private final UsersRepository usersRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUsersRequest dto){
        return usersRepository.save(Users.builder()
                .email(dto.getEmail())
                // ① 패스워드 암호화
                .pw(bCryptPasswordEncoder.encode(dto.getPw()))
                .build()).getId();
    }
}
