package me.jwc.springbootdeveloper.controller;

import lombok.RequiredArgsConstructor;
import me.jwc.springbootdeveloper.domain.Users;
import me.jwc.springbootdeveloper.dto.*;
import me.jwc.springbootdeveloper.service.UsersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러

public class UsersApiController {

    private final UsersService usersService;

    // HTTP메서드가 POST일 때 전달받은 URL과 동일하면 메서드로 매핑
    @PostMapping("/api/users") // http://localhost:8080/api/users
    // @RequestBody로 요청 본문 값 매핑
    public ResponseEntity<Users> addUsers(@RequestBody AddUsersRequest request) {
        Users savedUsers = usersService.save(request);
        // 요청한 자원이 성공적으로 생성되었으며 저장된 블로그 글 정보를 응답 객체에 담아 전송
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedUsers);
    }

    @GetMapping("/api/users")
    public ResponseEntity<List<UsersResponse>> findAllUsers() {
        List<UsersResponse> users = usersService.findAll()
                .stream()
                .map(UsersResponse::new)
                .toList();

        return ResponseEntity.ok()
                .body(users);
    }

}