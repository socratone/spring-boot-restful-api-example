package com.socratone.spring_boot_restful_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {
    private UserDaoService service;

    public UserResource(UserDaoService service) {
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> getUserList() {
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        User user = service.findOne(id);

        if (user == null)
            throw new UserNotFoundException(id);

        return user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.saveUser(user);

        URI location = ServletUriComponentsBuilder
                // 현재 요청에 해당하는 URL을 기반으로 URI 빌더를 초기화
                .fromCurrentRequest()
                // URL에 추가할 경로를 설정 (여기서는 "/{id}" 형태로 설정)
                .path("/{id}")
                // 경로에 대한 실제 값을 지정 (savedUser 객체의 id를 경로에 삽입)
                .buildAndExpand(savedUser.getId())
                // 최종적으로 URI 객체를 생성하여 반환
                .toUri();

        return ResponseEntity
                // 201 상태 코드 전달
                // URI를 인자로 받아 생성된 리소스의 위치를 나타내는 Location 헤더를 설정
                .created(location)
                .build();
    }
}
