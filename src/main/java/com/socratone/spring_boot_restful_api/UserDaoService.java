package com.socratone.spring_boot_restful_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

    // TODO: 임시 데이터베이스 설정
    private static List<User> users = new ArrayList<>();
    private int usersCount = 3;
    static {
        users.add(new User(1, "소크라테스", "123qwe!@#"));
        users.add(new User(2, "플라톤", "123qwe!@#"));
        users.add(new User(3, "아리스토텔레스", "123qwe!@#"));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

    public User saveUser(User user) {
        // TODO: 임시 id 설정
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
